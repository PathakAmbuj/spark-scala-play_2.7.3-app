// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Ambuj/IdeaProjects/play-scala-spark-app/conf/routes
// @DATE:Tue Oct 29 13:13:14 IST 2019


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
