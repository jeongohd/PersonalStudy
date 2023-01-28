package level_0;
// 구슬을 나누는 경우의 수
// 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
// 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
// balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

import java.math.BigInteger;

public class NumberOfCases {

    public static void main(String[] args) {

        int balls = 3;
        int share = 2;

        BigInteger answer = fac(balls).divide((fac(balls-share).multiply(fac(share))));
        System.out.println(answer);
    }

    static BigInteger fac(int num){ // BigInteger : int의 범위를 넘는 수
        BigInteger big = new BigInteger("1"); // 1부터 시작
        for (int i = 1; i <= num; i++) {
            big = big.multiply(new BigInteger(i+"")); // 1 ~ num 까지 곱하기. ==> Integer.toString(i)
        }
        return big;
    }

    // 팩토리얼 함수
    static int cases(int num) {
        if (num <= 1) {
            return num;
        } else {
            return num * cases(num - 1);
        }
    }


}
