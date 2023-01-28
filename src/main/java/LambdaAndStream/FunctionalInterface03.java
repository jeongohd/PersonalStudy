package LambdaAndStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface03 {
    public static void main(String[] args) {

        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); // 매개변수 String 리턴타입 Integer
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i); // 매개변수 Integer 리턴타입 String

        Function<String, String> h = f.andThen(g);
        Function<Integer, Integer> h2 = f.compose(g); // == g.andThen(f);

        System.out.println(h.apply("FF")); // "FF" -> 255 -> "11111111"
        System.out.println(h2.apply(2)); // 2 -> "10" -> 16

        Function<String, String> f2 = x -> x; // 항등 함수(identity function) 같은 값 출력.
        System.out.println(f2.apply("aaa")); // aaa

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer> notP = p.negate(); // i >= 100

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150)); // true
        System.out.println(all.test(99)); // false

        String str1 = "abc";
        String str2 = "abc";

        // 이어서 코딩할 것.
        Predicate<String> p2 = Predicate.isEqual(str1);
//        System.out.println(p.WeirdSort());







    }
}
