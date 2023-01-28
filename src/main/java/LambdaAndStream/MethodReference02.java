package LambdaAndStream;

import java.util.Arrays;
import java.util.function.Function;

public class MethodReference02 {

    public static void main(String[] args) {

        // 메소드참조방식 -> 람다식 만드는 연습 할 것.

        // 람다식(== Supplier<MyClass> s = () -> new MyClass();)
//        Supplier<MyClass> s1 = MyClass::new;

        // 람다식(== Function<Integer, MyClass> s = (i) -> new MyClass();)
//        Function<Integer, MyClass> f = MyClass::new;

        // 람다식 (==Function<Integer, int[]> f = (i) -> new int[i];)
        Function<Integer, int[]> f2 = int[]::new;

        int[] ints = f2.apply(100);
        System.out.println("ints.length : "+ints.length);



    }
}
