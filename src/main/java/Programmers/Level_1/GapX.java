package Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// x만큼 간격이 있는 n개의 숫자
// 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
public class GapX {
    public static void main(String[] args) {

        int x = -4;
        int n = 2;
        long[] answer = new long[n];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = x;
            x += answer[0];
        }
        System.out.println(Arrays.toString(answer));

    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;

    }
}
