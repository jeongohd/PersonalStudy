package Programmers.Level_1;

import java.util.HashMap;
import java.util.Map;


// 숫자문자열과 영단어
// 네오와 프로도가 숫자놀이를 하고 있습니다.
// 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
// 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
// 1478 → "one4seveneight"
// 234567 → "23four5six7"
// 10203 → "1zerotwozero3"
// 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
// s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

public class StringWithEngword {
    public static void main(String[] args) {

        String s = "23four5six7";
        // return 234567

        String[] strs = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(strs[i], i);
        }

        for (int i = 0; i < strs.length; i++) {
            if (s.contains(strs[i])) {
                s = s.replace(strs[i], map.get(strs[i])+"");
            }
        }
        System.out.println(Integer.parseInt(s));

    }

    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
