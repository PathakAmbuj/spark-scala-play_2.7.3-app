package controllers

import factory.SparkFactory
import javax.inject.{Inject, Singleton}
import org.apache.spark.launcher.SparkLauncher
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.types.{DoubleType, IntegerType, StringType, StructField, StructType}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import views.html.textToHtml

import scala.concurrent.Future

@Singleton
class SparkAppController @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  def index: Action[AnyContent] = {
    Action.async {

      val spark = SparkFactory.sparkSession
      val df = spark.read.format("csv").option("header", "true").load("conf/data.csv")
      val result = df.limit(100)

      val rawJson = result.toJSON.collectAsList()
      Future.successful(Ok(rawJson.toString))

    }
  }

  def runSparkJob(appResource: String, mainClass: String, appName: String): Action[AnyContent] = {
    Action.async {

      new SparkLauncher()
        .setSparkHome("/usr/local/Cellar/apache-spark/2.3.0/libexec")
        .setAppResource(appResource) //"/Users/Ambuj/Desktop/sparkRemoteRunApp.jar"
        .setMainClass(mainClass) //"com.ap.spark.SparkRemoteSubmit_JavaApp"
        .setAppName(appName) //"Spark-test-app"
        .setMaster("local")
        // .addAppArgs()
        // .addAppArgs()
        .startApplication()

      Future.successful(Ok(" Job Submitted Successfully ..........."))
    }
  }

  def getJson(outputCols: String, filePath: String, maxRow: String, scema: String): Action[AnyContent] = {
    Action.async {

      val row = maxRow.toInt
      val cols = outputCols.split(",")
      val spark = SparkFactory.sparkSession

      //schema creation from parameter
      val schemaStr = scema.split(",").toSeq
      var strField = Seq[StructField]()

      for (i <- schemaStr) {
        val dType = i.split(":")

        if (dType(1).equals("int"))
          strField = strField :+ StructField(dType(0), IntegerType, nullable = true)
         else if (dType(1).equals("string"))
          strField = strField :+ StructField(dType(0), StringType, nullable = true)
        else if (dType(1).equals("double"))
          strField = strField :+ StructField(dType(0), DoubleType, nullable = true)
      }

      val finalSchema = StructType(strField)

      var ds: DataFrame = null
      if (scema.isEmpty) {
        ds = spark.read.format("csv").option("header", "true")
          .load(filePath)
      } else {
        ds = spark.read.format("csv").schema(finalSchema)
          .load(filePath)
      }
      val res = ds.select(cols.head, cols.tail: _*)

      val sb = new StringBuilder
      val htmlHeader: String = "<!DOCTYPE html><html><head><style>table tbody, table thead{ display: block;}table tbody " +
        "{   overflow: auto;   height: 500px;} table thead {\n\t\n\tbackground:#f9f9fe;\n}\nth\n{\n\theight : 50px;\t\n\t" +
        "width : 150px;\n\ttext-align : left;\n\tborder: 1px solid black;\"\t\n}\ntd\n" +
        "{\n    width : 150px;\n    text-align: left;\n\tborder: 1px solid black;\"\n}\n</style>\n" +
        "</head>\n<body>\n\n<h2>HTML Table</h2>\n<table>\n<thead>\n<tr>"
      sb.append(htmlHeader)
      val schema = res.schema
      val scm = schema.fieldNames
      for (x <- scm) {
        sb.append("<th>" + x + "</th>")
      }
      sb.append("</tr></thead><tbody>")


      val list = res.limit(row).collect.toList
      for (l <- list) {
        sb.append("<tr>")
        for (x <- scm.indices) {
          sb.append("<td>" + l.get(x) + "</td>")
        }
        sb.append("</tr>")
      }

      sb.append("</tbody></table></body>\n" + "</html>")

      Future.successful(Ok(textToHtml.render(sb.toString())))

    }
  }
}



