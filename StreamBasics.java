package streambasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by NawazishMohammad on 26-08-2017.
 */
public class StreamBasics {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "b");
        Stream<String> streamStr = strings.stream();

        long l = streamStr.reduce(0L, (ll, s)-> ll+1,(a,b)->a+b);

        System.out.println(l);
    }
}
