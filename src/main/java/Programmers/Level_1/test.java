package Programmers.Level_1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 두 정수 사이의 합
// 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
// 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다
public class test {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        if (a > b) {
            int tem = a;
            a = b;
            b = tem;
        }
//        IntStream.rangeClosed(a,b).reduce(0, (a,b)-> a+b);
//         == ints.boxed().collect(reducing(0, (a,b) -> a + b));
//        int sum = IntStream.rangeClosed(a,b).reduce(0, Integer::sum);
        Integer ans = IntStream.rangeClosed(a, b).boxed().collect(Collectors.reducing(0, (v1, v2) -> v1 + v2));
        System.out.println(ans.longValue());
        System.out.println("ans.intValue() = " + ans.intValue());
        

    }
}
