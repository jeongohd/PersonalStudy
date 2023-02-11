package Programmers.Level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        // [[1, 4], [9, 2], [3, 8], [11, 6]]

        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < dots.length-1; i++) {
            for (int j = 1; j < dots.length; j++) {
                int x = dots[i][0] - dots[j][0];
                int y = dots[i][1] - dots[j][1];
                int[] tem = {x,y};
                list.add(tem);
            }
        }
        for (int i = 0; i < list.size(); i++) {

            System.out.println(Arrays.toString(list.get(i)));
        }


    }
}
