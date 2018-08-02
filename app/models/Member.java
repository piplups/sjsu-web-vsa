package models;

import java.util.ArrayList;
import java.util.List;

enum MemberType { regular, admin }
enum Family { none, blue, green, red, yellow }

public class Member {
    public String firstName;
    public String lastName;
    public String SID;          //SID: 010845869
    public String description;
    public String major;
    public MemberType type;
    public Family fam;
    public double volunteerHours;
    // why are the attributes public?

    public Member() {}

    public Member (String fi, String l, String s, String d, String m, MemberType t, Family fa) {
        this.firstName = fi;
        this.lastName = l;
        this.SID = s;
        this.description = d;
        this.major = m;
        this.type = t;
        this.fam = fa;
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
        members.add(new Member("Nicole", "Phan", "000000001", "SJSU VSA Co-Prezi 2018-19"));
        members.add(new Member("Jenny", "Nguyen", "000000002", "SJSU VSA Co-Prezi 2018-19, UVSA Summit Executive Director"));
        members.add(new Member("Philip", "Nguyen", "000000003", "SJSU VSA Webmaster"));
        members.add(new Member("E.J.", "Brand", "000000004", "SJSU VSA Webmaster"));
        members.add(new Member("Hieu Minh", "Tran", "000000005", "EVO Competitor"));
    }
    //for practice *NEVER DO THIS IRL*
    public static List<Member> findAll() {
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
    }


}