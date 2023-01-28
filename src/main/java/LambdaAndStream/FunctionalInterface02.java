package LambdaAndStream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface02 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100)+1; // 매개변수 x 리턴 o
        Consumer<Integer> c = i -> System.out.print(i + ", "); // 매개변수 o 리턴 x
        Predicate<Integer> p = i -> i%2==0; // 조건식(짝수인지 검사)
        Function<Integer,Integer> f = i -> i / 10 * 10; // i의 일의자리를 버리는 함수.

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println("from makeRandomList : "+list);

        printEventNum(p, c, list);

        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);

    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());
        for (T i : list) {
            newList.add(f.apply(i));
        }
        return newList;
    }

    static <T> void printEventNum(Predicate<T> p, Consumer<T> c, List<T> list){
        System.out.print("[");
        for (T i : list) {
            if (p.test(i)) {
                c.accept(i);
            }
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }
}
