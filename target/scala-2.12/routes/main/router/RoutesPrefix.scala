// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Philip/IdeaProjects/beginner-app/conf/routes
// @DATE:Tue Aug 14 19:34:13 PDT 2018


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
