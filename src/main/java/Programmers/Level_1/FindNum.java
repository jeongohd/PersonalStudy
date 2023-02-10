package Programmers.Level_1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 나머지가 1이 되는 수 찾기
// 자연수 n이 매개변수로 주어집니다.
// n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
// 답이 항상 존재함은 증명될 수 있습니다.
public class FindNum {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> list
                = IntStream.rangeClosed(1, n)
                .filter(v -> n % v == 1).sorted().boxed()
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list.get(0));
    }

    public int solution(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }

    public int solution2(int n) {
        int answer = 0;
        for (int i=2; i<n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
