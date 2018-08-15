// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Philip/IdeaProjects/beginner-app/conf/routes
// @DATE:Tue Aug 14 19:34:13 PDT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:12
  class ReverseMemberController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def destroy(userName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "members/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userName", userName)))
    }
  
    // @LINE:13
    def newMember(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "members/new")
    }
  
    // @LINE:14
    def details(userName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "members/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userName", userName)))
    }
  
    // @LINE:12
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "members/")
    }
  
    // @LINE:16
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "members/")
    }
  
    // @LINE:17
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "members/edit")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
