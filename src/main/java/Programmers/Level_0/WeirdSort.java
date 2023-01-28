package Programmers.Level_0;

import java.util.Arrays;

/*
    특이한 정렬
    정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
    이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
    정수가 담긴 배열 numlist와 정수 n이 주어질 때
    numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
*/

public class test {
    public static void main(String[] args) {
        int[] nums = {10000,20,36,47,40,6,10,7000};
        int n = 30;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = Math.abs(nums[i] - n);
                int b = Math.abs(nums[j] - n);
                if (a > b || (a == b && nums[i] < nums[j])) {
                    int tem = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tem;
                }
            }
        }

        System.out.println(Arrays.toString(nums));




    }
}
