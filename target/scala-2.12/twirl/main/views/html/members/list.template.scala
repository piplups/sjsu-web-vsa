
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(members: List[Member]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/(""" """),format.raw/*1.26*/("""<!-- the parameter list, name_of_param : type_of_parameter. (This is Scala code)-->
<!-- the list template -->
"""),_display_(/*3.2*/main("VSA Members")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/(""" """),format.raw/*3.24*/("""<!-- this line calls another template, the one called main -->
                       <!-- underneath this tag will be the <body> tad of our rendered HTML page -->
                       <!-- the "at"s are Scala expressions-->
<h2>All Members</h2>
    <table class = "table table-striped">
        <thead>
            <tr>
                <th>SID</th>
                <th>Last Name</th>
                <th>First Name</th>
                <th>Description</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*17.10*/for(member <- members) yield /*17.32*/ {_display_(Seq[Any](format.raw/*17.34*/("""
            """),format.raw/*18.13*/("""<tr>
                <td><a href=""""),_display_(/*19.31*/routes/*19.37*/.MemberController.details(member.SID)),format.raw/*19.74*/("""">"""),_display_(/*19.77*/member/*19.83*/.SID),format.raw/*19.87*/("""</a></td>
                <td><a href=""""),_display_(/*20.31*/routes/*20.37*/.MemberController.details(member.SID)),format.raw/*20.74*/("""">"""),_display_(/*20.77*/member/*20.83*/.lastName),format.raw/*20.92*/("""</a></td>
                <td><a href=""""),_display_(/*21.31*/routes/*21.37*/.MemberController.details(member.SID)),format.raw/*21.74*/("""">"""),_display_(/*21.77*/member/*21.83*/.firstName),format.raw/*21.93*/("""</a></td>
                <td><a href=""""),_display_(/*22.31*/routes/*22.37*/.MemberController.details(member.SID)),format.raw/*22.74*/("""">"""),_display_(/*22.77*/member/*22.83*/.description),format.raw/*22.95*/("""</a></td>
            </tr>
        """)))}),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(members:List[Member]): play.twirl.api.HtmlFormat.Appendable = apply(members)

  def f:((List[Member]) => play.twirl.api.HtmlFormat.Appendable) = (members) => apply(members)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Aug 10 22:30:53 PDT 2018
                  SOURCE: C:/Users/Philip/IdeaProjects/beginner-app/app/views/members/list.scala.html
                  HASH: d06e41e42ae916ea99c71287b7de91e1c587fbb8
                  MATRIX: 961->1|1079->24|1107->25|1246->139|1273->158|1312->160|1340->161|1901->695|1939->717|1979->719|2021->733|2084->769|2099->775|2157->812|2187->815|2202->821|2227->825|2295->866|2310->872|2368->909|2398->912|2413->918|2443->927|2511->968|2526->974|2584->1011|2614->1014|2629->1020|2660->1030|2728->1071|2743->1077|2801->1114|2831->1117|2846->1123|2879->1135|2949->1174|2986->1184
                  LINES: 28->1|33->1|33->1|35->3|35->3|35->3|35->3|49->17|49->17|49->17|50->18|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|54->22|54->22|54->22|56->24|57->25
                  -- GENERATED --
              */
          