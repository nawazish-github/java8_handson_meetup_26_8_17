package firstclasscitizen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

@BojugMember
public class Member {
    private final String technology;
    private final String designation;
    private final String name;

    public Member(String technology, String designation, String name) {
        this.technology = technology;
        this.designation = designation;
        this.name = name;
    }

    public String getTechnology() {
        return technology;
    }

    public String getDesignation() {
        return designation;
    }

    public static List<Member> getMembers(){
        return Arrays.asList(new Member("JavaSE", "dev", "xyz"),
                             new Member("JavaEE", "mngr", "abc"),
                             new Member("JavaME", "consultant","pqr"));
    }












    public static List<Member> filter (List<Member> members,
                                Predicate<Member> predicate){
        List<Member>list = new ArrayList<>();
        for(Member mem : members){
            if(predicate.test(mem))
                list.add(mem);
        }
        return list;

    }

    @Override
    public String toString(){
       return this.name+" -- "+this.technology+" -- "+this.designation;
    }
}
