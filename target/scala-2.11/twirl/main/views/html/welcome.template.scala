
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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
</head>
<body>
<h1 style="text-align:center;">Welcome To REST Api Service Test Page</h1>
<hr>
<hr>
Below are the link for testing Rest api services
<hr>
<p>To get Json as response >>><a href="http://localhost:9000/runspark">Click Here</a><<<</p>
<p>To Go to Job Submit Page >>><a href="/jobpage">Click Here</a></p>
<p>To Go to Create Job Page >>><a href="/form">Click Here</a></p>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-29T13:26:26.602
                  SOURCE: /Users/Ambuj/IdeaProjects/play-scala-spark-app/app/views/welcome.scala.html
                  HASH: 32fd70d2358ab9487a8a3748d5b0bf269b9880e3
                  MATRIX: 813->0
                  LINES: 26->1
                  -- GENERATED --
              */
          