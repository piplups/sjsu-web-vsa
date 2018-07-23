package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;  // need for list funciton
import models.Member;   // need to import the Member model package
import views.html.members.list;

public class MemberController extends Controller {

    //action methods cannot be static as of version 2.6.x
    //list all members
    public Result list() {
        List<Member> members = Member.findAll();
        return ok(list.render(members));
    }

    //show a blank product
    public Result newMember(){
        return TODO;
    }

    //show a member edit form
    public Result details(String SID){
        return TODO;
    }

    //save member data
    public Result save() {
        return TODO;
    }
}