package Programmers.Level_1;

import org.apache.lucene.search.MultiCollectorManager;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// k번째 수
public class test {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

//        int i = 2;
//        int j = 5;
//        int k = 3;
//        String joining = Arrays.stream(array).mapToObj(v->String.valueOf(v)).collect(Collectors.joining()); // 1526374
//        joining = joining.substring(i-1,j); // 5263
//        joining = Arrays.stream(joining.split("")).sorted().collect(Collectors.joining()); // 2356
//        System.out.println(joining.charAt(k-1)); // 5


        int[] answer = new int[commands.length];
        String joining = Arrays.stream(array).mapToObj(v->String.valueOf(v)).collect(Collectors.joining()); // 1526374
        for (int x = 0; x < commands.length; x++) {
            String joining2 = joining;
            joining2 = joining2.substring(commands[x][0]-1,commands[x][1]);
            joining2 = Arrays.stream(joining2.split(""))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining());
            answer[x] = Integer.parseInt(String.valueOf(joining2.charAt(commands[x][2]-1)));
        }
        System.out.println(Arrays.toString(answer));








    }


}
