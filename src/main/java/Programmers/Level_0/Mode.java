package Programmers.Level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

// 최빈값 구하기
// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
// 최빈값이 여러 개면 -1을 return 합니다.

public class Mode {
    public static void main(String[] args) {
        int[] ints = new int[100];
        int[] array = {1,1,1,2,2};
        for (int i = 0; i < array.length; i++) {
            ints[array[i]]++;
        }
        System.out.println(Arrays.toString(ints));

        int max = IntStream.of(ints).max().orElse(0);
        long count = IntStream.of(ints).filter(v -> v == max).count();
//        List<int[]> list = new ArrayList<>(Arrays.asList(ints));
//        int idx = list.indexOf(max);
        int idx = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == max) {
                idx = i;
            }
        }
        System.out.println("max : "+max);
        System.out.println("count : "+count);
        System.out.println("idx : "+idx);
        if(count > 1) {
            System.out.println(-1);
        } else {
            System.out.println(idx);
        }

    }
}
