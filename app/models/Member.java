package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

enum MemberType { regular, admin }
enum Family { none, blue, green, red, yellow }

public class Member {
    public String firstName;
    public String lastName;
    public String userName;
    public String SID;          //SID: 010845869
    public String description;
    //public String major;
    public MemberType type;
    public Family fam;
    public double volunteerHours;
    // why are the attributes public?

    public Member() {}

    public Member (String fi, String l, String u, String s, String d){//}, MemberType t) {
        this.firstName = fi;
        this.lastName = l;
        this.userName = u;
        this.SID = s;
        this.description = d;
        //this.type = t;
        this.volunteerHours = 0;
    }

    public String toString() {
        return String.format("%s, %s\n%s\n%s", lastName, firstName, SID, description);
    }

    //actions must always return a RESULT, which is an object that is part of
    //the play.mvc.Result subclass. It can tell Play all that is needs to construct
    //an HTTP response.
    //for practice
    private static List<Member> members;
    static {
        members = new ArrayList<Member>();
        members.add(new Member("Nicole", "Phan", "phvntastic", "000000001", "SJSU VSA Co-Prezi 2018-19"));
        members.add(new Member("Jenny", "Nguyen", "bubblyj", "000000002", "SJSU VSA Co-Prezi 2018-19, UVSA Summit Executive Director"));
        members.add(new Member("Philip", "Nguyen", "piplups", "000000003", "SJSU VSA Webmaster"));
        members.add(new Member("E.J.", "Brand", "ejb", "000000004", "SJSU VSA Webmaster"));
        members.add(new Member("Hieu Minh", "Tran", "hieuypoo", "000000005", "EVO Competitor"));
    }
    //for practice *NEVER DO THIS IRL*
    /*private static Set<Member> membersSet;

    static {
        membersSet = new HashSet<>();
        membersSet.add(new Member("Nicole", "Phan", "phvntastic", "000000001", "SJSU VSA Co-Prezi 2018-19", type.admin));
        membersSet.add(new Member("Jenny", "Nguyen", "bubblyj", "000000002", "SJSU VSA Co-Prezi 2018-19, UVSA Summit Executive Director", type.admin));
        membersSet.add(new Member("Philip", "Nguyen", "piplups", "000000003", "SJSU VSA Webmaster", type.admin));

    }
    public static Set<Member> everyMembers(){
        return membersSet;
    }
    private static List<Member> members;
    static {
        members = new ArrayList<Member>();
        members.add(new Member("Nicole", "Phan", "phvntastic", "000000001", "SJSU VSA Co-Prezi 2018-19", type.admin));
        members.add(new Member("Jenny", "Nguyen", "bubblyj", "000000002", "SJSU VSA Co-Prezi 2018-19, UVSA Summit Executive Director", type.admin));
        members.add(new Member("Philip", "Nguyen", "piplups", "000000003", "SJSU VSA Webmaster", type.admin));
        members.add(new Member("E.J.", "Brand", "ejbrand", "000000004", "SJSU VSA Webmaster", type.admin));
        members.add(new Member("Hieu Minh", "Tran", "hieuypoo", "000000005", "EVO Competitor", type.regular));
        members.add(new Member("Edward", "Lee", "edlee", "000000006", "SJSU VSA Web Project Manager", type.admin));
    }*/

    public static List<Member> allMembers(){return members;}

    public static void add(Member member){
        members.add(member);
    }
    public static boolean remove(Member member){
        return members.remove(member);
    }
    /*public static Member findByUserName(String userName)
    {
        for (Member member : members){
            if(id.equals(member.userName)){
                return member;
            }
        }
        return null;
    }

    public static void add(Member member){
        members.add(member);
    }

    public static boolean remove(Member member){
        return members.remove(member);
    }
    */
    /*public static List<Member> findAll() {
        return new ArrayList<Member>(members);
    }

    public static Member findBySID(String s){
        for(Member candidate : members){
            if (candidate.SID.equals(s))
                return candidate;
        }
        return null;
    }
    public static List<Member> findByName(String name) {
        final List<Member> results = new ArrayList<Member>();
        for(Member candidate : members) {
            if(candidate.firstName.toLowerCase().contains(name.toLowerCase()) ||
                    candidate.lastName.toLowerCase().contains(name.toLowerCase()))
                results.add(candidate);
        }
        return results;
    }

    public static boolean remove(Member member) {
        return members.remove(member);
    }

    public void save() {
        members.remove(findByName(this.SID));
        members.add(this);
    }*/


}