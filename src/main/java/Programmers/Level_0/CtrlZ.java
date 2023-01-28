package Programmers.Level_0;
// 컨트롤 제트
// 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
// 문자열에 있는 숫자를 차례대로 더하려고 합니다. 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
// 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.

import java.util.Arrays;
import java.util.Stack;

public class CtrlZ {
    public static void main(String[] args) {

        int answer = ctrlZ2("10 Z 20 Z 30");

        System.out.println(answer);
    }

    private static int ctrlZ2(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
                System.out.println(stack);
            } else {
                stack.push(Integer.parseInt(w));
                System.out.println(stack);
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }


    static int ctrlZ(String str) {
        String[] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("Z")) {
                strs[i] = "0";
                strs[i-1] = "0";
            }
        }
        int answer = Arrays.stream(strs).mapToInt(Integer::parseInt).sum();
        return answer;
    }


}
