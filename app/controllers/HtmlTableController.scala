package controllers

import factory.SparkFactory
import javax.inject.{Inject, Singleton}
import org.apache.spark.sql.SparkSession
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import views.html.textToHtml
import scala.concurrent.Future

@Singleton
class HtmlTableController @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  val spark: SparkSession = SparkFactory.sparkSession

  def getHtmlTableAction: Action[AnyContent] = {
    Action.async {
      {

        val sb = new StringBuilder
        val htmlHeader: String = "<!DOCTYPE html><html><head><style>table tbody, table thead{ display: block;}table tbody " +
          "{   overflow: auto;   height: 500px;} table thead {\n\t\n\tbackground:#f9f9fe;\n}\nth\n{\n\theight : 50px;\t\n\t" +
          "width : 150px;\n\ttext-align : left;\n\tborder: 1px solid black;\"\t\n}\ntd\n" +
          "{\n    width : 150px;\n    text-align: left;\n\tborder: 1px solid black;\"\n}\n</style>\n" +
          "</head>\n<body>\n\n<h2>HTML Table</h2>\n<table>\n<thead>\n<tr>"


        sb.append(htmlHeader)
        val readDF = spark.read.format("csv").option("sep", ",")
          .option("header", "true").load("/Users/Ambuj/Downloads/aapl.csv")

        val schema = readDF.schema
        val scm = schema.fieldNames
        for (x <- scm) {
          sb.append("<th>" + x + "</th>")
        }
        sb.append("</tr></thead><tbody>")

        val list = readDF.collect.toList

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
}
