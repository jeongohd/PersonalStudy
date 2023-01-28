package LambdaAndStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalInterface01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
        Collections.sort(list, new Comparator<String>(){
                                    public int compare(String s1, String s2){
                                        return s2.compareTo(s1);
                                    }
                        });

        // 위 코드를 간단하게 람다식으로.
        List<String> list2 = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
//        Collections.sort(list2, (s1, s2) -> s2.compareTo(s1));
        Collections.sort(list2, (s1, s2) -> s1.compareTo(s2));

        System.out.println(list2);






    }
}
