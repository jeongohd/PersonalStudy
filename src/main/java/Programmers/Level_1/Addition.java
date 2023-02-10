package Programmers.Level_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 없는 숫자 더하기
// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
public class Addition {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        List<Integer> list = IntStream.rangeClosed(0, 9).boxed().collect(Collectors.toList());
        for (int i = 0; i < numbers.length ; i++) {
            list.remove(Integer.valueOf(numbers[i]));
            // list.remove(numbers[i]);
            /**
                 ★ remove(int index) / remove(Object obj)
                 리스트 안의 인덱스를 제거하지 말고 값을 제거하기위해 Integer 객체로 형 변환하여 해당 값을 삭제.
             **/
        }
        int sum = list.stream().mapToInt(v -> v).sum();
        System.out.println(sum);

    }

    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }

    public int solution2(int[] numbers) {
        return 45-Arrays.stream(numbers).sum();
    }
}
