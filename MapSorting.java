package lambdamapsorting;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by NawazishMohammad on 25-08-2017.
 */
public class MapSorting {
    //static Map<Integer, String> map = new TreeMap<>(new MyComparator());
    /*static Map<Integer, String> map = new TreeMap<>((o1, o2)->{
        if(o1.intValue()>o2.intValue())
            return 1;
        else
        if(o1.intValue()<o2.intValue())
            return -1;
        else
            return 0;
    });*/
    //static Map<Integer, String> map = new TreeMap<>(MapSorting::mycompare);
    static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put(24,"three");
        map.put(8,"one");
        map.put(16,"two");

        map = sortMe(map);


        System.out.println(map);
        System.out.println(map.size());
    }


    private static Map<Integer,String> sortMe(Map<Integer, String> map) {
       return map.entrySet()
                .stream()
                .sorted(MapSorting::compareEntries)
                .collect(Collectors.toMap(MapSorting::getKey,
                                          MapSorting::getValue,
                                          (old, newv)-> old,
                                           LinkedHashMap::new));
    }

    private static int compareEntries(Map.Entry<Integer, String> e1,
                                            Map.Entry<Integer, String> e2) {
        if(e1.getKey()>e2.getKey())
            return 1;
        else
        if(e1.getKey()<e2.getKey())
            return -1;
        return 0;
    }

    public static Integer getKey(Map.Entry entry){
        return (Integer)entry.getKey();
    }

    public static String getValue(Map.Entry entry){
        return (String)entry.getValue();
    }
    public static int mycompare(Integer o1, Integer o2){
        if(o1.intValue()>o2.intValue())
            return 1;
        else
        if(o1.intValue()<o2.intValue())
            return -1;
        else
            return 0;
    }

}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer  o1, Integer o2) {
        if(o1.intValue()>o2.intValue())
            return 1;
        else
            if(o1.intValue()<o2.intValue())
                return -1;
                else
                 return 0;
    }
}
