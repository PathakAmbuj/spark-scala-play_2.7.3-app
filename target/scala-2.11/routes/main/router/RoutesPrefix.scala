// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Ambuj/IdeaProjects/play-scala-starter-example/conf/routes
// @DATE:Mon Oct 28 21:12:24 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
