// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Ambuj/IdeaProjects/play-scala-spark-app/conf/routes
// @DATE:Tue Oct 29 20:03:26 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  LoginController_0: controllers.LoginController,
  // @LINE:9
  HomeController_5: controllers.HomeController,
  // @LINE:11
  FormController_4: controllers.FormController,
  // @LINE:14
  SparkAppController_1: controllers.SparkAppController,
  // @LINE:17
  HtmlTableController_3: controllers.HtmlTableController,
  // @LINE:19
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    LoginController_0: controllers.LoginController,
    // @LINE:9
    HomeController_5: controllers.HomeController,
    // @LINE:11
    FormController_4: controllers.FormController,
    // @LINE:14
    SparkAppController_1: controllers.SparkAppController,
    // @LINE:17
    HtmlTableController_3: controllers.HtmlTableController,
    // @LINE:19
    Assets_2: controllers.Assets
  ) = this(errorHandler, LoginController_0, HomeController_5, FormController_4, SparkAppController_1, HtmlTableController_3, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginController_0, HomeController_5, FormController_4, SparkAppController_1, HtmlTableController_3, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.loginCheck(txtUserName:String, txtPassword:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobpage""", """controllers.HomeController.jobpage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """form""", """controllers.FormController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """runspark""", """controllers.SparkAppController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getjson""", """controllers.SparkAppController.getJson(selectColumns:String, filePath:String, maxRow:String, schema:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submitjob""", """controllers.SparkAppController.runSparkJob(jarPath:String, mainClass:String, appName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gettable""", """controllers.HtmlTableController.getHtmlTableAction"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_LoginController_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_login0_invoker = createInvoker(
    LoginController_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_loginCheck1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_loginCheck1_invoker = createInvoker(
    HomeController_5.loginCheck(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginCheck",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """login""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_jobpage2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobpage")))
  )
  private[this] lazy val controllers_HomeController_jobpage2_invoker = createInvoker(
    HomeController_5.jobpage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "jobpage",
      Nil,
      "GET",
      this.prefix + """jobpage""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_FormController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("form")))
  )
  private[this] lazy val controllers_FormController_index3_invoker = createInvoker(
    FormController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "index",
      Nil,
      "GET",
      this.prefix + """form""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SparkAppController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("runspark")))
  )
  private[this] lazy val controllers_SparkAppController_index4_invoker = createInvoker(
    SparkAppController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SparkAppController",
      "index",
      Nil,
      "GET",
      this.prefix + """runspark""",
      """ Rest Services are implimented under below URL and Controllers using spark""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_SparkAppController_getJson5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getjson")))
  )
  private[this] lazy val controllers_SparkAppController_getJson5_invoker = createInvoker(
    SparkAppController_1.getJson(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SparkAppController",
      "getJson",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """getjson""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_SparkAppController_runSparkJob6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submitjob")))
  )
  private[this] lazy val controllers_SparkAppController_runSparkJob6_invoker = createInvoker(
    SparkAppController_1.runSparkJob(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SparkAppController",
      "runSparkJob",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """submitjob""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HtmlTableController_getHtmlTableAction7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gettable")))
  )
  private[this] lazy val controllers_HtmlTableController_getHtmlTableAction7_invoker = createInvoker(
    HtmlTableController_3.getHtmlTableAction,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HtmlTableController",
      "getHtmlTableAction",
      Nil,
      "GET",
      this.prefix + """gettable""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_LoginController_login0_route(params@_) =>
      call { 
        controllers_LoginController_login0_invoker.call(LoginController_0.login)
      }
  
    // @LINE:9
    case controllers_HomeController_loginCheck1_route(params@_) =>
      call(params.fromQuery[String]("txtUserName", None), params.fromQuery[String]("txtPassword", None)) { (txtUserName, txtPassword) =>
        controllers_HomeController_loginCheck1_invoker.call(HomeController_5.loginCheck(txtUserName, txtPassword))
      }
  
    // @LINE:10
    case controllers_HomeController_jobpage2_route(params@_) =>
      call { 
        controllers_HomeController_jobpage2_invoker.call(HomeController_5.jobpage)
      }
  
    // @LINE:11
    case controllers_FormController_index3_route(params@_) =>
      call { 
        controllers_FormController_index3_invoker.call(FormController_4.index)
      }
  
    // @LINE:14
    case controllers_SparkAppController_index4_route(params@_) =>
      call { 
        controllers_SparkAppController_index4_invoker.call(SparkAppController_1.index)
      }
  
    // @LINE:15
    case controllers_SparkAppController_getJson5_route(params@_) =>
      call(params.fromQuery[String]("selectColumns", None), params.fromQuery[String]("filePath", None), params.fromQuery[String]("maxRow", None), params.fromQuery[String]("schema", None)) { (selectColumns, filePath, maxRow, schema) =>
        controllers_SparkAppController_getJson5_invoker.call(SparkAppController_1.getJson(selectColumns, filePath, maxRow, schema))
      }
  
    // @LINE:16
    case controllers_SparkAppController_runSparkJob6_route(params@_) =>
      call(params.fromQuery[String]("jarPath", None), params.fromQuery[String]("mainClass", None), params.fromQuery[String]("appName", None)) { (jarPath, mainClass, appName) =>
        controllers_SparkAppController_runSparkJob6_invoker.call(SparkAppController_1.runSparkJob(jarPath, mainClass, appName))
      }
  
    // @LINE:17
    case controllers_HtmlTableController_getHtmlTableAction7_route(params@_) =>
      call { 
        controllers_HtmlTableController_getHtmlTableAction7_invoker.call(HtmlTableController_3.getHtmlTableAction)
      }
  
    // @LINE:19
    case controllers_Assets_versioned8_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned8_invoker.call(Assets_2.versioned(file))
      }
  }
}
