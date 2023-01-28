package LambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 5, 4, 2);
        List<Integer> sortedList = list.stream().sorted()
                .collect(Collectors.toList()); // 리스트를 정렬해서 새 리스트에 저장.
        System.out.println(list);
        System.out.println(sortedList);

        IntStream ints
                = new Random().ints(1, 46); // 1~45범위의 무한 스트림
        ints.distinct().limit(6).sorted()
                .forEach(i -> System.out.print(i+", "));


        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
        // parallel() - 병렬스트림. 스트림의 작업을 병렬로 처리.
        int sum = strStream.parallel().mapToInt(a->a.length()).sum(); // 모든 문자열 길이의 합.
        System.out.println("Sum of length of All Strings : "+sum);




    }
}
