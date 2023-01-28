package level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;

        int[] numlist2 = numlist.clone();
        for (int i = 0; i < numlist2.length; i++) {
            numlist2[i] = Math.abs(numlist2[i] - 30);
        }
        System.out.println(Arrays.toString(numlist2));
        // [9970, 10, 6, 17, 10, 24, 20, 6970]

        IntStream sorted = IntStream.of(numlist2).sorted();


        sorted.forEach(System.out::println);



//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < numlist2.length; i++) {
//            map.put(i, Math.abs(numlist2[i] - 30));
//        }





    }
}
