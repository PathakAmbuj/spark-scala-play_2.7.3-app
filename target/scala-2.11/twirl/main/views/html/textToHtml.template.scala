
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object textToHtml extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(myString: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/Html(myString)))
      }
    }
  }

  def render(myString:String): play.twirl.api.HtmlFormat.Appendable = apply(myString)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (myString) => apply(myString)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-29T20:16:50.187
                  SOURCE: /Users/Ambuj/IdeaProjects/play-scala-spark-app/app/views/textToHtml.scala.html
                  HASH: e66071c7754008cd75adfbc7b349a233f00d2e65
                  MATRIX: 734->1|846->20|873->22
                  LINES: 21->1|26->2|27->3
                  -- GENERATED --
              */
          