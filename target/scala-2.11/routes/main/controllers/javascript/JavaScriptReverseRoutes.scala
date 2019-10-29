// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Ambuj/IdeaProjects/play-scala-spark-app/conf/routes
// @DATE:Tue Oct 29 13:13:14 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:14
  class ReverseSparkAppController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def runSparkJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SparkAppController.runSparkJob",
      """
        function(jarPath0,mainClass1,appName2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submitjob" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("jarPath", jarPath0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mainClass", mainClass1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("appName", appName2)])})
        }
      """
    )
  
    // @LINE:14
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SparkAppController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "runspark"})
        }
      """
    )
  
    // @LINE:15
    def getJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SparkAppController.getJson",
      """
        function(selectColumns0,filePath1,maxRow2,schema3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getjson" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("selectColumns", selectColumns0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("filePath", filePath1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("maxRow", maxRow2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("schema", schema3)])})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def jobpage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.jobpage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jobpage"})
        }
      """
    )
  
    // @LINE:9
    def loginCheck: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginCheck",
      """
        function(txtUserName0,txtPassword1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("txtUserName", txtUserName0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("txtPassword", txtPassword1)])})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseFormController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FormController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "form"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
