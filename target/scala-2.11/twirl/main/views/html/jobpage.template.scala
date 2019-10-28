
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

object jobPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Job Page</title>
    <style>
        * """),format.raw/*7.11*/("""{"""),format.raw/*7.12*/("""
        """),format.raw/*8.9*/("""box-sizing: border-box;
        """),format.raw/*9.9*/("""}"""),format.raw/*9.10*/("""

        """),format.raw/*11.9*/("""input[type=text], select, textarea """),format.raw/*11.44*/("""{"""),format.raw/*11.45*/("""
        """),format.raw/*12.9*/("""width: 100%;
        padding: 12px;
        border: 1px solid #ccc;
        border-radious: 4px;
        resize: vertical;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""

        """),format.raw/*19.9*/("""label """),format.raw/*19.15*/("""{"""),format.raw/*19.16*/("""
        """),format.raw/*20.9*/("""padding: 12px 12px 12px 0;
        display: inline-block;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""

        """),format.raw/*24.9*/("""input[type=submit] """),format.raw/*24.28*/("""{"""),format.raw/*24.29*/("""
        """),format.raw/*25.9*/("""background-color: #4CAF50;
        color: white;
        padding: 12px 20px;
        border: none;
        border-radious: 4px;
        cursor: pointer;
        float: right;
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""

        """),format.raw/*34.9*/("""input[type=submit]:hover """),format.raw/*34.34*/("""{"""),format.raw/*34.35*/("""
        """),format.raw/*35.9*/("""background-color: #45a049;
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/("""

        """),format.raw/*38.9*/(""".container """),format.raw/*38.20*/("""{"""),format.raw/*38.21*/("""
        """),format.raw/*39.9*/("""border-radious: 5px;
        background-color: #f2f2f2;
        padding: 20px;
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/("""

        """),format.raw/*44.9*/(""".col-25 """),format.raw/*44.17*/("""{"""),format.raw/*44.18*/("""
        """),format.raw/*45.9*/("""float: left;
        width: 25%;
        margin-top: 6px;
        """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/("""

        """),format.raw/*50.9*/(""".col-75 """),format.raw/*50.17*/("""{"""),format.raw/*50.18*/("""
        """),format.raw/*51.9*/("""float: left;
        width: 75%;
        margin-top: 6px;
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/("""

        """),format.raw/*56.9*/("""/* clear floats after the columns */
        .row:after """),format.raw/*57.20*/("""{"""),format.raw/*57.21*/("""
            """),format.raw/*58.13*/("""content: "";
            display:table;
            clear: both;
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/("""



    """),format.raw/*65.5*/("""</style>
</head>
<body>
  <H2>Input Form</H2>
<p>All the fields are mandatory kindly fill in proper format.</p>

<div class="container">
    <form action="http://localhost:9000/submitjob">
        <div class="row">
            <div class="col-25>">
                <label for="jarpath">Application JAR path</label>
            </div>
            <div class="col-75">
                <input type="text" id="jarpath" name="jarPath" placeholder="eg. /usr/ambuj/myApp.jar">
            </div>
        </div>
        <div class="row">
            <div class="col-25>">
                <label for="mainclass">Main Class Name </label>
            </div>
            <div class="col-75">
                <input type="text" id="mainclass" name="mainClass" placeholder="eg. com.spark.MainClassName">
            </div>
        </div>
        <div class="row">
            <div class="col-25>">
                <label for="appname">Your Application Name</label>
            </div>
            <div class="col-75">
                <input type="text" id="appname" name="appName" placeholder="eg. my-spark-app ">
            </div>
        </div>
        <div class="row">
            <input type="submit" value="Submit">
        </div>
    </form>
</div>
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
                  DATE: 2019-10-28T20:50:55.914
                  SOURCE: /Users/Ambuj/IdeaProjects/play-scala-starter-example/app/views/jobPage.scala.html
                  HASH: b924214d8201ae17ba324c301e422b1741083ad5
                  MATRIX: 813->0|1003->163|1031->164|1066->173|1124->205|1152->206|1189->216|1252->251|1281->252|1317->261|1475->392|1504->393|1541->403|1575->409|1604->410|1640->419|1733->485|1762->486|1799->496|1846->515|1875->516|1911->525|2121->708|2150->709|2187->719|2240->744|2269->745|2305->754|2367->789|2396->790|2433->800|2472->811|2501->812|2537->821|2651->908|2680->909|2717->919|2753->927|2782->928|2818->937|2911->1003|2940->1004|2977->1014|3013->1022|3042->1023|3078->1032|3171->1098|3200->1099|3237->1109|3321->1165|3350->1166|3391->1179|3491->1252|3520->1253|3555->1261
                  LINES: 26->1|32->7|32->7|33->8|34->9|34->9|36->11|36->11|36->11|37->12|42->17|42->17|44->19|44->19|44->19|45->20|47->22|47->22|49->24|49->24|49->24|50->25|57->32|57->32|59->34|59->34|59->34|60->35|61->36|61->36|63->38|63->38|63->38|64->39|67->42|67->42|69->44|69->44|69->44|70->45|73->48|73->48|75->50|75->50|75->50|76->51|79->54|79->54|81->56|82->57|82->57|83->58|86->61|86->61|90->65
                  -- GENERATED --
              */
          