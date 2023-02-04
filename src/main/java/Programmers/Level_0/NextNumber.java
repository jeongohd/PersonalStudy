package Programmers.Level_0;

import java.util.ArrayList;
import java.util.List;

// 다음에 올 숫자
// 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
public class NextNumber {
    public static void main(String[] args) {
        int[] common = {-5,10, -20, 40};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < common.length-1; i++) {
            list.add(common[i+1] - common[i]);
        }
        System.out.println(list);
        int last = common[common.length - 1];
        if (list.get(0) == list.get(1)) {
            int result = last + list.get(0);
            System.out.println(result);
        } else {
            int result = last * list.get(1)/list.get(0);
            System.out.println(result);
        }

    }

    public int solution(int[] common) {
        int answer = 0;

        int x = common[1] - common[0];
        int y = common[2] - common[1];

        if (x == y) {
            answer = common[common.length - 1] + y;
        } else {
            answer = common[common.length - 1] * common[2] / common[1];
        }
        return answer;
    }
}
