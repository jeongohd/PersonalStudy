package Programmers.Level_1;

import java.util.Arrays;

// 문자열 다루기 기본
// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
// 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
public class DealWithString {
    public static void main(String[] args) {
        String s = "1234";

        /** Ideal way **/
        if (s.length() == 4 || s.length() == 6) {
            try {
                int i = Integer.parseInt(s);
                System.out.println(true);
            } catch (Exception e) {
                System.out.println(false);
            }
        } else {
            System.out.println(false);
        }


        /** 2 way **/
//        String p = "[0-9]";
//        String answer = Stream.of(s.split("")).filter(v-> Pattern.matches(p, v))
//                .collect(Collectors.joining());
//        if ((s.length() == 4 || s.length() == 6) && answer.length() == s.length()) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
    }

    public boolean solution(String s) {
        return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
    }
}
