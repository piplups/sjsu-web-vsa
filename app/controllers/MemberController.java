package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;  // need for list funciton
import java.util.ArrayList;

import models.Member;   // need to import the Member model package
import controllers.MemberData;
import javax.inject.Inject;
import javax.inject.Singleton;
import play.data.FormFactory;
import play.data.Form;

import views.html.members.*;

@Singleton
public class MemberController extends Controller {

    private final Form<MemberData> form;
    private final List<Member> members;

    @Inject
    public MemberController(FormFactory formFactory){
        this.form = formFactory.form(MemberData.class);
        this.members = new ArrayList<Member>();
        members.add(new Member("Nicole", "Phan", "phvntastic", "000000001", "SJSU VSA Co-Prezi 2018-19"));
        members.add(new Member("Jenny", "Nguyen", "bubblyj", "000000002", "SJSU VSA Co-Prezi 2018-19, UVSA Summit Executive Director"));
        members.add(new Member("Philip", "Nguyen", "piplups", "000000003", "SJSU VSA Webmaster"));
        members.add(new Member("E.J.", "Brand", "ejb", "000000004", "SJSU VSA Webmaster"));
        members.add(new Member("Hieu Minh", "Tran", "hieuypoo", "000000005", "EVO Competitor"));

    } //will help us create a form for members


    //action methods cannot be static as of version 2.6.x
    //list all members
    public Result list() {
        //List<Member> members = Member.allMembers();
        return ok(list.render(members));
    }

    public Result asdfList() {
        //Set<Member> members = Member.everyMembers();
        return TODO;//ok(list.render(members));
    }

    //show a blank product
    public Result newMember(){

        final Form<MemberData> boundForm = form.bindFromRequest();

        if(boundForm.hasErrors()){
            flash("error", "Please correct the form below.");
            return badRequest(create.render(boundForm));
        }
        else {
            MemberData data = boundForm.get();
            members.add(new Member(data.getFirstName(), data.getLastName(), data.getUserName(), data.getSID(), data.getDescription()));
            flash("success", String.format("Successfully added %s %s", data.getFirstName(), data.getLastName()));
            return redirect(routes.MemberController.list());
            //return ok(create.render(memberForm));
        }
    }

    //show a member edit form
    public Result details(String userName){
        return TODO;
    }

    //save member data
    public Result save(){ return TODO; }
    /*public Result save() {
        Form<Member> memberForm = formFactory.form(MemberData.class).bindFromRequest();
        if(memberForm.hasErrors()){
            flash("error", "Please correct the form below.");
            return badRequest(create.render(memberForm));
        }
        Member member = memberForm.get();
        Member.add(member);
        flash("success", String.format("Successfully added %s %s", member.firstName, member.lastName));
        return redirect(routes.MemberController.list());
        //return ok(String.format("Registered member %s %s", member.firstName, member.lastName));
    }*/

    public Result update() { return TODO; }

    public Result destroy(String userName) { return TODO; }
}