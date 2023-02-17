package Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 모의고사
public class test4 {
    public static void main(String[] args) {

        int[] ans = {1,3,2,4,2};

        int[] a = {1,2,3,4,5}; // 5
        int[] b = {2,1,2,3,2,4,2,5}; // 8
        int[] c = {3,3,1,1,2,2,4,4,5,5}; // 10

        int n = 40;

        int[] aa = new int[n];
        int[] bb = new int[n];
        int[] cc = new int[n];
        int[] anss = new int[n];

        int cntA = 0;
        int cntB = 0;
        int cntC = 0;

        for (int i = 0; i < n; i++) {
            aa[i] = a[i%a.length];
            bb[i] = b[i%b.length];
            cc[i] = c[i%c.length];
            anss[i] = ans[i%ans.length];
        }
        for (int i = 0; i < n; i++) {
            if (anss[i] == aa[i]) {
                cntA++;
            }
            if (anss[i] == bb[i]) {
                cntB++;
            }
            if (anss[i] == cc[i]) {
                cntC++;
            }
        }
        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(bb));
        System.out.println(Arrays.toString(cc));
        System.out.println(Arrays.toString(anss));


        System.out.println("cntA = " + cntA);
        System.out.println("cntB = " + cntB);
        System.out.println("cntC = " + cntC);




    }
}
