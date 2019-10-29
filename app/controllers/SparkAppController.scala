package controllers

import factory.SparkFactory
import javax.inject.{Inject, Singleton}
import org.apache.spark.launcher.SparkLauncher
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

import scala.concurrent.Future

@Singleton
class SparkAppController @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  def index: Action[AnyContent] = {
    Action.async {

      val spark = SparkFactory.sparkSession
      val df = spark.read.format("csv").option("header", "true").load("conf/data.csv")
      val result =  df.limit(100)

      val rawJson = result.toJSON.collectAsList()
      Future.successful(Ok(rawJson.toString))

    }
  }

  def getJson(outputCols: String, filePath: String, maxRow: String, schema: String): Action[AnyContent] = {
    Action.async {

      val row = maxRow.toInt
      val cols = outputCols.split(",")
      val spark = SparkFactory.sparkSession

      val ds  = spark.read.format("csv").option("header", "true")
        .load(filePath)

      val res = ds.select(cols.head, cols.tail: _*)

      val jsonData = res.limit(row).toJSON.collectAsList()
      Future.successful(Ok(jsonData.toString))
    }
  }

  def runSparkJob(appResource: String , mainClass: String , appName: String): Action[AnyContent] = {
    Action.async {

      new SparkLauncher()
        .setSparkHome("/usr/local/Cellar/apache-spark/2.3.0/libexec")
        .setAppResource(appResource)//"/Users/Ambuj/Desktop/sparkRemoteRunApp.jar"
        .setMainClass(mainClass)//"com.ap.spark.SparkRemoteSubmit_JavaApp"
        .setAppName(appName)//"Spark-test-app"
        .setMaster("local")
        // .addAppArgs()
        // .addAppArgs()
        .startApplication()

      Future.successful(Ok(" Job Submitted Successfully ..........."))
    }
  }
}



