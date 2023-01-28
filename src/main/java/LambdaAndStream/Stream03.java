package LambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream03 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intS = list.stream();
        intS.forEach(System.out::print); // == intS.forEach(i -> System.out.print(i));


        String[] strArr = {"a", "b", "c", "d"};
//        Stream<String> strS = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strS = Stream.of(strArr);
        strS.forEach(System.out::print);


        // 기본형 스트림 - IntStream, LongStream, DoubleStream
        // 오토박싱&언박싱의 비효율이 제거됨. Stream<Integer> 대신 IntStream 을 사용.
        // 숫자와 관련된 유용한 메서드를 Stream<T>보다 더 많이 제공

        int[] intArr = {1, 2, 3, 4, 5};
//        IntStream intStream = Stream.of(intArr);
        IntStream intStream = Arrays.stream(intArr);
//        System.out.println("intStream.sum() : " + intStream.sum());
//        System.out.println("intStream.count() : " + intStream.count());
        System.out.println("intStream.average() : " + intStream.average());

//        Integer[] intArr2 = {1, 2, 3, 4, 5};
//        Stream<Integer> intSS = Arrays.stream(intArr2);
//        System.out.println(intSs.sum()); 기본형 스트림이 아니라서 sum() 메소드가 없음.

    }
}
