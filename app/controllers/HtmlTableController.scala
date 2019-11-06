package controllers

import factory.SparkFactory
import javax.inject.{Inject, Singleton}
import org.apache.spark.sql.SparkSession
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import views.html.createFormattedTable
import scala.concurrent.Future

@Singleton
class HtmlTableController @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  val spark: SparkSession = SparkFactory.sparkSession

  def getHtmlTableAction: Action[AnyContent] = {
    Action.async {
      { 
        val readDF = spark.read.format("csv").option("sep", ",")
          .option("header", "true").load("conf/data.csv")

        val schema = readDF.schema
        val scm = schema.fieldNames

        val list = readDF.collect.toList

        Future.successful(Ok(createFormattedTable.render(scm, list)))
      }
    }
  }
}
