
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

object loginError extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Login Page</title>
    <style>
        /* Basics */
        html, body
        """),format.raw/*10.9*/("""{"""),format.raw/*10.10*/("""
            """),format.raw/*11.13*/("""padding: 0;
            margin: 0;
            width: 100%;
            height: 100%;
            font-family: "Helvetica Neue" , Helvetica, sans-serif;
            background: #FFFFFF;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""
        """),format.raw/*18.9*/(""".logincontent
        """),format.raw/*19.9*/("""{"""),format.raw/*19.10*/("""
            """),format.raw/*20.13*/("""position: fixed;
            width: 350px;
            height: 300px;
            top: 50%;
            left: 50%;
            margin-top: -150px;
            margin-left: -175px;
            background: #07A8C3;
            padding-top: 10px;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""
        """),format.raw/*30.9*/(""".loginheading
        """),format.raw/*31.9*/("""{"""),format.raw/*31.10*/("""
            """),format.raw/*32.13*/("""border-bottom: solid 1px #ECF2F5;
            padding-left: 18px;
            padding-bottom: 10px;
            color: #ffffff;
            font-size: 20px;
            font-weight: bold;
            font-family: sans-serif;
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/("""
        """),format.raw/*40.9*/("""label
        """),format.raw/*41.9*/("""{"""),format.raw/*41.10*/("""
            """),format.raw/*42.13*/("""color: #ffffff;
            display: inline-block;
            margin-left: 18px;
            padding-top: 10px;
            font-size: 15px;
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""
        """),format.raw/*48.9*/("""input[type=text], input[type=password]
        """),format.raw/*49.9*/("""{"""),format.raw/*49.10*/("""
            """),format.raw/*50.13*/("""font-size: 14px;
            padding-left: 10px;
            margin: 10px;
            margin-top: 12px;
            margin-left: 18px;
            width: 300px;
            height: 35px;
            border: 1px solid #ccc;
            border-radius: 2px;
            box-shadow: inset 0 1.5px 3px rgba(190, 190, 190, .4), 0 0 0 5px #f5f5f5;
            font-size: 14px;
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/("""
        """),format.raw/*62.9*/("""input[type=checkbox]
        """),format.raw/*63.9*/("""{"""),format.raw/*63.10*/("""
            """),format.raw/*64.13*/("""margin-left: 18px;
            margin-top: 30px;
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/("""
        """),format.raw/*67.9*/(""".loginremember
        """),format.raw/*68.9*/("""{"""),format.raw/*68.10*/("""
            """),format.raw/*69.13*/("""background: #ECF2F5;
            height: 70px;
            margin-top: 20px;
        """),format.raw/*72.9*/("""}"""),format.raw/*72.10*/("""
        """),format.raw/*73.9*/(""".check
        """),format.raw/*74.9*/("""{"""),format.raw/*74.10*/("""
            """),format.raw/*75.13*/("""font-family: sans-serif;
            position: relative;
            top: -2px;
            margin-left: 2px;
            padding: 0px;
            font-size: 12px;
            color: #321;
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/("""
        """),format.raw/*83.9*/(""".loginbtn
        """),format.raw/*84.9*/("""{"""),format.raw/*84.10*/("""
            """),format.raw/*85.13*/("""float: right;
            margin-right: 20px;
            margin-top: 20px;
            padding: 6px 20px;
            font-size: 14px;
            font-weight: bold;
            color: #fff;
            background-color: #07A8C3;
            background-image: -webkit-gradient(linear, left top, left bottom, from(#07A8C3), to(#6EE4E8));
            background-image: -moz-linear-gradient(top left 90deg, #07A8C3 0%, #6EE4E8 100%);
            background-image: linear-gradient(top left 90deg, #07A8C3 0%, #6EE4E8 100%);
            border-radius: 30px;
            border: 1px solid #07A8C3;
            cursor: pointer;
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/("""
        """),format.raw/*100.9*/(""".loginbtn:hover
        """),format.raw/*101.9*/("""{"""),format.raw/*101.10*/("""
            """),format.raw/*102.13*/("""background-image: -webkit-gradient(linear, left top, left bottom, from(#b6e2ff), to(#6ec2e8));
            background-image: -moz-linear-gradient(top left 90deg, #b6e2ff 0%, #6ec2e8 100%);
            background-image: linear-gradient(top left 90deg, #b6e2ff 0%, #6ec2e8 100%);
        """),format.raw/*105.9*/("""}"""),format.raw/*105.10*/("""


    """),format.raw/*108.5*/("""</style>
</head>
<body>
<form action="http://localhost:9000/login">
    <div class="logincontent">
        <div class="loginheading">
            Login
        </div>
        <label for="txtUserName">
            Username:</label>
        <input type="text" id="txtUserName" name="txtUserName"/>
        <label for="txtPassword">
            Password:</label>
        <input type="password" id="txtPassword" name="txtPassword"/>
        <p style="text-align: center;">Incorrect Credentials .......</p>
        <div class="loginremember">
            <input type="checkbox" id="chbRemember" name="chbRemember"/><label class="check"
                                                                               for="chbRemember">Remember me next
            time</label>
            <input type="submit" class="loginbtn" value="Login" id="btnSubmit"/>
        </div>
    </div>
</form>
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
                  DATE: 2019-10-28T20:50:55.982
                  SOURCE: /Users/Ambuj/IdeaProjects/play-scala-starter-example/app/views/loginError.scala.html
                  HASH: fdd0c4fe6658ad0e41e2396177cd46327add0454
                  MATRIX: 816->0|1187->344|1216->345|1257->358|1478->552|1507->553|1543->562|1592->584|1621->585|1662->598|1941->850|1970->851|2006->860|2055->882|2084->883|2125->896|2385->1129|2414->1130|2450->1139|2491->1153|2520->1154|2561->1167|2738->1317|2767->1318|2803->1327|2877->1374|2906->1375|2947->1388|3353->1767|3382->1768|3418->1777|3474->1806|3503->1807|3544->1820|3628->1877|3657->1878|3693->1887|3743->1910|3772->1911|3813->1924|3925->2009|3954->2010|3990->2019|4032->2034|4061->2035|4102->2048|4327->2246|4356->2247|4392->2256|4437->2274|4466->2275|4507->2288|5164->2918|5193->2919|5230->2928|5282->2952|5312->2953|5354->2966|5668->3252|5698->3253|5733->3260
                  LINES: 26->1|35->10|35->10|36->11|42->17|42->17|43->18|44->19|44->19|45->20|54->29|54->29|55->30|56->31|56->31|57->32|64->39|64->39|65->40|66->41|66->41|67->42|72->47|72->47|73->48|74->49|74->49|75->50|86->61|86->61|87->62|88->63|88->63|89->64|91->66|91->66|92->67|93->68|93->68|94->69|97->72|97->72|98->73|99->74|99->74|100->75|107->82|107->82|108->83|109->84|109->84|110->85|124->99|124->99|125->100|126->101|126->101|127->102|130->105|130->105|133->108
                  -- GENERATED --
              */
          