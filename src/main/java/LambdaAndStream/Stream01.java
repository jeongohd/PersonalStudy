package LambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream(); // 컬렉션
        Stream<String> stringStream = Stream.of(new String[]{"a", "b", "c"}); // 배열
        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2); // 0, 2, 4, 6..
        Stream<Double> randomStream = Stream.generate(Math::random); // 람다식
        IntStream intStream1 = new Random().ints(5); // 난수 스트림. 크기 5.

        /*
        컬렉션(List, Set, Map), 배열(Array) -> Stream -> 중간연산(n번 실행) -> 최종연산(1번) -> 결과
        */

        String[] strArr = {"dd", "aaa", "Cc", "dd", "b", "aaa"};
        Stream.of(strArr).distinct().limit(5).sorted().forEach(System.out::println);
        // distinct, limit, sorted 중간연산
        // forEach 최종연산

    }
}
