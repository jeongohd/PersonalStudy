package LambdaAndStream;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream07 {
    public static void main(String[] args) {

        // 최종연산

        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream"
                , "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).parallel().forEach(System.out::println); // parallel 병렬처리하여 순서 제각기.
//        Stream.of(strArr).parallel().forEachOrdered(System.out::println); // forEachOrdered 앞 -> 뒤

        boolean noneMatch = Stream.of(strArr).noneMatch(v->v.length()==0);
        Optional<String> findFirst = Stream.of(strArr).filter(v -> v.charAt(0) == 's').findFirst();

        System.out.println("noneMatch : "+ noneMatch);
        System.out.println("findFirst : "+ findFirst.orElse("empty"));


//        Stream<Integer> ints = Stream.of(strArr).map(String::length);
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);


        int count = intStream1.reduce(0, (a,b)-> a+1);
        int sum = intStream2.reduce(0, (a,b)-> a+b);
        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);


        System.out.println("count : "+ count);
        System.out.println("sum : "+ sum);
        System.out.println("max : " + max.orElseGet(()->0));
//        == System.out.println("max : " + max.orElse(0));
        System.out.println("min : " + min.getAsInt());

    }
}
