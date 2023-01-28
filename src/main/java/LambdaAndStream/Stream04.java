package LambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream04 {
    public static void main(String[] args) {

        // 무한 스트림 (ints(), longs(), doubles().. )
        // 무한 스트림은 limit 으로 잘라줘야 함. 혹은 크기를 지정해 줄 수 있음.
        // IntStream ints = new Random().ints(5);
        // IntStream ints = new Random().ints();
        IntStream ints = new Random().ints(10,5,10); // 5~9 숫자 중 10개 반환.
        ints
//          .limit(5)
            .forEach(System.out::println);


        IntStream ints2 = IntStream.range(1, 5); // 1,2,3,4
        IntStream ints3 = IntStream.rangeClosed(1, 5); // 1,2,3,4,5


        // iterate(T seed, UnaryOperator f) 단항 연산자
        Stream<Integer> ints4 = Stream.iterate(1, n -> n+2);
        ints4.limit(5).forEach(System.out::print);

        // generate(Supplier s) : 입력 x. 출력 o. 주기만 함.
        Stream<Integer> ints5 = Stream.generate(()->1);
        ints5.limit(5).forEach((i)-> System.out.print(i));













    }
}
