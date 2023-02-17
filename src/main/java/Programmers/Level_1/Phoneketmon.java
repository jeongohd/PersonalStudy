package Programmers.Level_1;

import java.util.stream.IntStream;


// 폰켓몬
public class Phoneketmon {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        int len = nums.length/2;
        long count = IntStream.of(nums).distinct().count();
        if (count > len) {
            System.out.println(len);
        } else System.out.println(count);


    }
}
