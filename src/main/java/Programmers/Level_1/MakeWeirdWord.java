package Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

// 이상한 문자 만들기
// 문제 설명
// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
// 제한 사항
// 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
// 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
public class MakeWeirdWord {
    public static void main(String[] args) {
        String s = "abc abcd abcde";
        /** ★ split("구분자", "인자값") - 인자값에 -1을 넣을 경우 공백도 문자열 **/
        String[] strs = s.split(" ",-1);
        for (int i = 0; i < strs.length; i++) {
            String temp = "";
            String[] tem =  strs[i].split("");
            for (int j = 0; j < strs[i].length(); j++) {
                if (j % 2 == 0) {
                    tem[j] = tem[j].toUpperCase();

                } else {
                    tem[j] = tem[j].toLowerCase();
                }
                temp = Arrays.stream(tem).collect(Collectors.joining());
            }
            strs[i] = temp;

        }

        String ans = Arrays.stream(strs).collect(Collectors.joining(" "));
        System.out.println(ans);
    }

    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}
