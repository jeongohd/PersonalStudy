package Programmers.Level_1;

import java.util.stream.IntStream;


// 내적
// 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
// [1,2,3,4]	[-3,-1,0,2]
// a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.
public class StreamIdx {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i]*b[i];
        }
        System.out.println(sum);

    }

    /** ★ Stream index 활용 **/
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }
}
