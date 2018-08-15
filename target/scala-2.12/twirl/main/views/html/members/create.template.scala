
package views.html.members

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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[MemberData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(memberForm : Form[MemberData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Member Signup")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
    """),format.raw/*5.5*/("""<h1>Member Signup</h1>
    """),_display_(/*6.6*/helper/*6.12*/.form(action = routes.MemberController.newMember())/*6.63*/{_display_(Seq[Any](format.raw/*6.64*/("""


        """),_display_(/*9.10*/helper/*9.16*/.inputText(memberForm("firstName"))),format.raw/*9.51*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(memberForm("lastName"))),format.raw/*10.50*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(memberForm("userName"))),format.raw/*11.50*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(memberForm("SID"))),format.raw/*12.45*/("""
        """),_display_(/*13.10*/helper/*13.16*/.textarea(memberForm("description"))),format.raw/*13.52*/("""
        """),format.raw/*14.9*/("""<input type="submit" value="Register" class="btn btn-primary">
        """)))}),format.raw/*15.10*/("""

""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(memberForm:Form[MemberData]): play.twirl.api.HtmlFormat.Appendable = apply(memberForm)

  def f:((Form[MemberData]) => play.twirl.api.HtmlFormat.Appendable) = (memberForm) => apply(memberForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Aug 14 22:06:04 PDT 2018
                  SOURCE: C:/Users/Philip/IdeaProjects/beginner-app/app/views/members/create.scala.html
                  HASH: 3740f8d0ded34625e587226ff87e9b6a9f5e4c51
                  MATRIX: 967->1|1071->35|1116->32|1144->52|1172->55|1201->76|1240->78|1272->84|1326->113|1340->119|1399->170|1437->171|1478->186|1492->192|1547->227|1585->238|1600->244|1655->278|1693->289|1708->295|1763->329|1801->340|1816->346|1866->375|1904->386|1919->392|1976->428|2013->438|2117->511|2152->516
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|38->6|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|47->15|49->17
                  -- GENERATED --
              */
          