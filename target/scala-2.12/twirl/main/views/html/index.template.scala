
package views.html

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to SJSU VSA")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/(""" """),format.raw/*3.32*/("""<!-- <body>-->
<div class="navbar">
  <a href="homepage.html">Home</a>
  <a href="#">Events</a>
  <a href="#">Meet the Officers</a>
  <a href="#">Contact</a>
</div>

<div class="bgimg-1" style="margin-top: 50px">
  <div class="caption">
    <span class ="border">Welcome to SJSU VSA</span>
  </div>
</div>

<div class="lighter-block">
  <h3 style="text-align:center;">SJSU VSA</h3>
  <p>Welcome to the website for San Jose State University's Vietnamese Student Association.
    We are a club on campus that allows students to surround themselves with others that are interested
    in the Vietnamese culture. We have 4 pillars that are Academic, Community, Cultural, and Social that area
    fulfilled by the plethora of activities and projects that we plan for our fellow club members.</p>
</div>

<div class="bgimg-2">
  <div class="caption">
    <span class="border" style="background-color:transparent;font-size:25px;color: #f7f7f7;">VSA Olympics</span>
  </div>
</div>

<div style="position:relative;">
  <div class="dark-block">
    <p style="text-align:center;">Join VSA to make friends, immerse yourself in the Vietnamese culture, and volunteer with us
      to strengthen and support the Vietnamese community!</p>
  </div>
</div>

<div class="bgimg-3">
  <div class="caption">
    <!-- OPTIONAL CAPTION, but Black April banner already speaks for picture -->
  </div>
</div>

<div class="lighter-block">
  <h3 style="text-align:center;">Come Join Us!</h3>
  <p style="text-align:center;">General Meetings are Thursdays at 5:30PM in Baccardo Business Complex 004</p>
</div>
""")))}),format.raw/*48.2*/("""<!-- </body>-->
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Jun 23 12:28:01 PDT 2018
                  SOURCE: C:/Users/Philip/IdeaProjects/beginner-app/app/views/index.scala.html
                  HASH: cf3a6191080defc4f30743b9193a28a91c9b2e72
                  MATRIX: 941->1|1037->3|1067->8|1102->35|1141->37|1169->38|2826->1665
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|80->48
                  -- GENERATED --
              */
          