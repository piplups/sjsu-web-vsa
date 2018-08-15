package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;  // need for list funciton

import models.Member;   // need to import the Member model package
import javax.inject.Inject;
import play.data.FormFactory;
import play.data.Form;

import views.html.members.*;

public class MemberController extends Controller {

    @Inject
    FormFactory formFactory; //will help us create a form for members


    //action methods cannot be static as of version 2.6.x
    //list all members
    public Result list() {
        List<Member> members = Member.allMembers();
        return ok(list.render(members));
    }

    public Result asdfList() {
        //Set<Member> members = Member.everyMembers();
        return TODO;//ok(list.render(members));
    }

    //show a blank product
    public Result newMember(){

        Form<Member> memberForm = formFactory.form(Member.class);

        return ok(create.render(memberForm));
    }

    //show a member edit form
    public Result details(String userName){
        return TODO;
    }

    //save member data
    public Result save() {
        Form<Member> memberForm = formFactory.form(Member.class).bindFromRequest();
        if(memberForm.hasErrors()){
            flash("error", "Please correct the form below.");
            return badRequest(create.render(memberForm));
        }
        Member member = memberForm.get();
        Member.add(member);
        flash("success", String.format("Successfully added %s %s", member.firstName, member.lastName));
        return redirect(routes.MemberController.list());
        //return ok(String.format("Registered member %s %s", member.firstName, member.lastName));
    }

    public Result update() { return TODO; }

    public Result destroy(String userName) { return TODO; }
}