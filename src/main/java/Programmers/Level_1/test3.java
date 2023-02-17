package Programmers.Level_1;

import java.util.stream.IntStream;

// 소수찾기 (시간초과 에러)
public class test3 {
    public static void main(String[] args) {
        int n = 10;
        int cnt = (int)IntStream.rangeClosed(1,n).filter(v->tellPrimeNumber(v) == true).count();
//        int cnt = 0;
//        for (int i = 1; i <= n; i++) {
//            if (tellPrimeNumber(i)) cnt++;
//        }
        System.out.println(cnt);

    }

    static boolean tellPrimeNumber(int n) {
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) cnt++;
        }
        return cnt == 1 ? true : false;
    }
}
