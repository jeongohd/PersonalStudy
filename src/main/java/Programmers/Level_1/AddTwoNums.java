package Programmers.Level_1;

import java.util.*;

// 두 개 뽑아서 더하기
// 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
// 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
public class AddTwoNums {
    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++){
                if (i != j) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        // Integer[] -> int[]
        Integer[] ans = list.stream().distinct().sorted().toArray(Integer[]::new);
        int[] answer = Arrays.stream(ans).mapToInt(Integer::intValue).toArray();


    }

    class Solution {
        public int[] solution(int[] numbers) {
            Set<Integer> set = new HashSet<>();
            for(int i=0; i<numbers.length; i++) {
                for(int j=i+1; j<numbers.length; j++) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
            return set.stream().sorted().mapToInt(Integer::intValue).toArray();
        }
    }

}
