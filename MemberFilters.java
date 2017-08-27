package firstclasscitizen;

/**
 * Created by NawazishMohammad on 25-08-2017.
 */
public class MemberFilters {

    public static boolean techFilter (Member member){
        return member.getTechnology().equals("JavaSE");
    }

    public static boolean desigFilter (Member member){
        return member.getTechnology().equals("JavaEE");
    }
}
