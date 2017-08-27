package firstclasscitizen;

import java.util.List;

/**
 *  Behavior Parameterization
 */
public class FunctionsAsFirstClassCitizen {
    public static void main(String[] args) {










        List<Member> members = Member.getMembers();
        System.out.println(Member.filter(members, /*MemberFilters::techFilter*/ mem-> {return true;}));

        System.out.println(Member.filter(members, /*MemberFilters::techFilter*/ mem-> {return true;}));
        //System.out.println(Member.filter(members, (mem)-> mem.getTechnology().equals("JavaSE")));
    }
}
