// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Ambuj/IdeaProjects/play-scala-starter-example/conf/routes
// @DATE:Mon Oct 28 21:12:24 IST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:14
  class ReverseSparkAppController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def runSparkJob(jarPath:String, mainClass:String, appName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "submitjob" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("jarPath", jarPath)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mainClass", mainClass)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("appName", appName)))))
    }
  
    // @LINE:15
    def getJson(filePath:String, outputCols:String, maxRow:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getjson" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filePath", filePath)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("outputCols", outputCols)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("maxRow", maxRow)))))
    }
  
    // @LINE:14
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "runspark")
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def jobpage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "jobpage")
    }
  
    // @LINE:9
    def loginCheck(txtUserName:String, txtPassword:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("txtUserName", txtUserName)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("txtPassword", txtPassword)))))
    }
  
  }

  // @LINE:11
  class ReverseFormController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "form")
    }
  
  }

  // @LINE:6
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def login(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
