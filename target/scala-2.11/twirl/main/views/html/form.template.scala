
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

object form extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <form action="http://localhost:9000/getjson">
        <div class="row">
            <div class="col-25>">
                <label for="outputColumns">Select output column</label>
            </div>
            <div class="col-75">
                <input type="text" id="outputColumns" name="selectColumns" placeholder="eg. id,name,salary..">
            </div>
        </div>
        <div class="row">
            <div class="col-25>">
                <label for="filepath">Input File Path</label>
            </div>
            <div class="col-75">
                <input type="text" id="filepath" name="filePath" placeholder="eg. /usr/ambuj/data.csv">
            </div>
        </div>
        <div class="row">
            <div class="col-25>">
                <label for="maxrow">Maximum Output Rows</label>
            </div>
            <div class="col-75">
                <input type="text" id="maxrow" name="maxRow" placeholder="eg. 10, 100, 1000  ...">
            </div>
        </div>
        <div class="row">
            <div class="col-25>">
                <label for="schema">Provide Schema for the file</label>
            </div>
            <div class="col-75">
                <input type="text" id="schema" name="schema" placeholder="eg. id:int, name:string ..">
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
                  DATE: 2019-10-29T13:08:32.328
                  SOURCE: /Users/Ambuj/IdeaProjects/play-scala-spark-app/app/views/form.scala.html
                  HASH: d557b5adc94ccffc060d025ecf7b2fab8fabf27a
                  MATRIX: 810->0|1000->163|1028->164|1063->173|1121->205|1149->206|1186->216|1249->251|1278->252|1314->261|1472->392|1501->393|1538->403|1572->409|1601->410|1637->419|1730->485|1759->486|1796->496|1843->515|1872->516|1908->525|2118->708|2147->709|2184->719|2237->744|2266->745|2302->754|2364->789|2393->790|2430->800|2469->811|2498->812|2534->821|2648->908|2677->909|2714->919|2750->927|2779->928|2815->937|2908->1003|2937->1004|2974->1014|3010->1022|3039->1023|3075->1032|3168->1098|3197->1099|3234->1109|3318->1165|3347->1166|3388->1179|3488->1252|3517->1253|3552->1261
                  LINES: 26->1|32->7|32->7|33->8|34->9|34->9|36->11|36->11|36->11|37->12|42->17|42->17|44->19|44->19|44->19|45->20|47->22|47->22|49->24|49->24|49->24|50->25|57->32|57->32|59->34|59->34|59->34|60->35|61->36|61->36|63->38|63->38|63->38|64->39|67->42|67->42|69->44|69->44|69->44|70->45|73->48|73->48|75->50|75->50|75->50|76->51|79->54|79->54|81->56|82->57|82->57|83->58|86->61|86->61|90->65
                  -- GENERATED --
              */
          