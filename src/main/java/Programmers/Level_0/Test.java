package Programmers.Level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int[] ints = new int[100];
        int[] array = {1, 2, 2,3, 3, 3, 3,3,4};
        for (int i = 0; i < array.length; i++) {
            ints[array[i]]++;
        }
        System.out.println(Arrays.toString(ints));

        int max = IntStream.of(ints).max().orElse(0);
        long count = IntStream.of(ints).filter(v -> v == max).count();
        List<int[]> list = new ArrayList<>(Arrays.asList(ints));
        int idx = list.indexOf(max);
        System.out.println("max : "+max);
        System.out.println("count : "+count);
        System.out.println("idx : "+idx);
        if(count > 1) {
            System.out.println(-1);
        } else {
            System.out.println(idx);
        }

        String[] arr = {"a","b","c"};
        System.out.println(Arrays.asList(arr).indexOf("y"));
    }
}
