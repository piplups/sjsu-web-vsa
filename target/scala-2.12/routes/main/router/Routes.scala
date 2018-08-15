// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Philip/IdeaProjects/beginner-app/conf/routes
// @DATE:Tue Aug 14 19:34:13 PDT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:12
  MemberController_2: controllers.MemberController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:12
    MemberController_2: controllers.MemberController
  ) = this(errorHandler, HomeController_0, Assets_1, MemberController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, MemberController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """members/""", """controllers.MemberController.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """members/new""", """controllers.MemberController.newMember()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """members/""" + "$" + """userName<[^/]+>""", """controllers.MemberController.details(userName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """members/""", """controllers.MemberController.save()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """members/edit""", """controllers.MemberController.update()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """members/delete/""" + "$" + """userName<[^/]+>""", """controllers.MemberController.destroy(userName:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_MemberController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("members/")))
  )
  private[this] lazy val controllers_MemberController_list2_invoker = createInvoker(
    MemberController_2.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "list",
      Nil,
      "GET",
      this.prefix + """members/""",
      """ Member Routing""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_MemberController_newMember3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("members/new")))
  )
  private[this] lazy val controllers_MemberController_newMember3_invoker = createInvoker(
    MemberController_2.newMember(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "newMember",
      Nil,
      "GET",
      this.prefix + """members/new""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_MemberController_details4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("members/"), DynamicPart("userName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_details4_invoker = createInvoker(
    MemberController_2.details(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "details",
      Seq(classOf[String]),
      "GET",
      this.prefix + """members/""" + "$" + """userName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_MemberController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("members/")))
  )
  private[this] lazy val controllers_MemberController_save5_invoker = createInvoker(
    MemberController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "save",
      Nil,
      "POST",
      this.prefix + """members/""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:17
  private[this] lazy val controllers_MemberController_update6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("members/edit")))
  )
  private[this] lazy val controllers_MemberController_update6_invoker = createInvoker(
    MemberController_2.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "update",
      Nil,
      "POST",
      this.prefix + """members/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MemberController_destroy7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("members/delete/"), DynamicPart("userName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_destroy7_invoker = createInvoker(
    MemberController_2.destroy(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "destroy",
      Seq(classOf[String]),
      "GET",
      this.prefix + """members/delete/""" + "$" + """userName<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_MemberController_list2_route(params@_) =>
      call { 
        controllers_MemberController_list2_invoker.call(MemberController_2.list())
      }
  
    // @LINE:13
    case controllers_MemberController_newMember3_route(params@_) =>
      call { 
        controllers_MemberController_newMember3_invoker.call(MemberController_2.newMember())
      }
  
    // @LINE:14
    case controllers_MemberController_details4_route(params@_) =>
      call(params.fromPath[String]("userName", None)) { (userName) =>
        controllers_MemberController_details4_invoker.call(MemberController_2.details(userName))
      }
  
    // @LINE:16
    case controllers_MemberController_save5_route(params@_) =>
      call { 
        controllers_MemberController_save5_invoker.call(MemberController_2.save())
      }
  
    // @LINE:17
    case controllers_MemberController_update6_route(params@_) =>
      call { 
        controllers_MemberController_update6_invoker.call(MemberController_2.update())
      }
  
    // @LINE:18
    case controllers_MemberController_destroy7_route(params@_) =>
      call(params.fromPath[String]("userName", None)) { (userName) =>
        controllers_MemberController_destroy7_invoker.call(MemberController_2.destroy(userName))
      }
  }
}
