package Programmers.Level_1;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 문자열 내림차순으로 배치
// 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
// s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
public class StringReverseOrder {
    public static void main(String[] args) {
        String s = "Zbacdefg";

        /** 1 way : StringBuilder(String).reverse().toString() **/
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//        System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));
//        String a = new StringBuilder(new String(chars)).reverse().toString();
//        System.out.println(a);


        /** ★ 2 way : collect(Collectors.joining()) 의 리턴값은 String **/
//        String[] strs = Stream.of(s.split("")).sorted(Comparator.reverseOrder()).map(v->String.valueOf(v)).toArray(String[]::new);
//        String answer = "";
//        for (String str : strs) {
//            answer+=str;
//        }
        String answer = Stream.of(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        System.out.println(answer);

        /** 3 way **/
//        char[] chars = s.toCharArray();
//        for (int j = 0; j < chars.length-1; j++) {
//            for (int i = 0;  i< chars.length-1; i++) {
//                if (chars[i] < chars[i + 1]) {
//                    char tem = chars[i];
//                    chars[i] = chars[i+1];
//                    chars[i+1] = tem;
//                }
//            }
//        }
//
//        String answer = new String(chars);
//        System.out.println("answer = " + answer);

    }
}
