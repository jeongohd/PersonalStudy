package Programmers.Level_1;

import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
public class Arr {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        long count = Arrays.stream(arr).filter(v -> v % divisor == 0).count();
        if(count == 0){
            int[] answer = {-1};
            System.out.println(Arrays.toString(answer));
        } else {
            int[] answer = new int[(int)count];
            Integer[] ints = Arrays.stream(arr).filter(v -> v % divisor == 0).sorted().boxed().toArray(Integer[]::new);
            for (int i = 0; i < ints.length; i++) {
                answer[i] = ints[i];
            }

            System.out.println(Arrays.toString(answer));
        }

    }
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        java.util.Arrays.sort(answer);
        return answer;
    }

}
