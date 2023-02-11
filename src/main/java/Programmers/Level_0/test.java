package Programmers.Level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

// 연속된 수의 합
// 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
// 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때,
// 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.

public class test {
    public static void main(String[] args) {
        int num = 5;
        int total = 15;
        Integer[] ints = IntStream.rangeClosed(-100, 100).boxed().toArray(Integer[]::new);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        int sum = 0;
        for (int i = 0; i < ints.length-num; i++) {
            for (int j = 0; j < num; j++) {
                sum += ints[i + j];
            }
            if (sum == total) {
                System.out.println("i = " + i);
            }
            sum = 0;
        }

        System.out.println(ints[101]);







    }
}
