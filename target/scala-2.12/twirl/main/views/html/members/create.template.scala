
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(memberForm : Form[Member]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Member Signup")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
    """),format.raw/*5.5*/("""<h1>Member Signup</h1>
    """),_display_(/*6.6*/helper/*6.12*/.form(action = routes.MemberController.save())/*6.58*/{_display_(Seq[Any](format.raw/*6.59*/("""
        

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

  def render(memberForm:Form[Member]): play.twirl.api.HtmlFormat.Appendable = apply(memberForm)

  def f:((Form[Member]) => play.twirl.api.HtmlFormat.Appendable) = (memberForm) => apply(memberForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Aug 14 19:34:12 PDT 2018
                  SOURCE: C:/Users/Philip/IdeaProjects/beginner-app/app/views/members/create.scala.html
                  HASH: e7a14c1bdd27152323252ea71dca891416885837
                  MATRIX: 963->1|1063->31|1108->28|1136->48|1164->51|1193->72|1232->74|1264->80|1318->109|1332->115|1386->161|1424->162|1473->185|1487->191|1542->226|1580->237|1595->243|1650->277|1688->288|1703->294|1758->328|1796->339|1811->345|1861->374|1899->385|1914->391|1971->427|2008->437|2112->510|2147->515
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|38->6|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|47->15|49->17
                  -- GENERATED --
              */
          