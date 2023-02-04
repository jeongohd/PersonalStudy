package Programmers.Level_0;

import java.util.Arrays;

// 분수의 덧셈
// 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
// 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class AdditionOfFraction {
    public static void main(String[] args) {
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;

        int mo = denom1 * denom2;
        int ja = numer1 * denom2 + numer2 * denom1;

        boolean flag = true;
        while (flag) {
            if (sol(ja, mo) != 1) {
                int t = sol(ja, mo);
                mo /= t;
                ja /= t;
            } else {
                flag = false;
            }
        }
        int[] ints = {ja, mo};
        System.out.println(Arrays.toString(ints));

    }

    // return 값이 1이면 기약분수.
    static int sol(int ja, int mo) {
        if (mo == 0) {
            return ja;
        } else {
            return sol(mo, ja%mo);
        }
    }






}
