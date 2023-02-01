package Programmers.Level_0;

import java.util.stream.Stream;


// 다항식 더하기
// 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
// 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
// 같은 식이라면 가장 짧은 수식을 return 합니다.

public class PlusOfFormula {
    public static void main(String[] args) {
        String answer = "";
        String str = "x";
        String[] strs = Stream.of(str.split(" ")).filter(v -> !v.equals("+")).toArray(String[]::new);

        int xInt = 0;
        int num = 0;
        for (int i=0; i<strs.length; i++) {
            if (strs[i].equals("x")) {
                xInt++;
            } else if (strs[i].contains("x") && strs[i].length() > 1) {
                String tem = strs[i].substring(0,strs[i].length()-1);
                xInt += Integer.parseInt(tem);
            } else {
                num += Integer.parseInt(strs[i]);
            }
        }
        answer = str.equals("x") ? str
                : (num == 0 && xInt == 0) ? ""
                : num == 0 ? xInt+"x"
                : xInt == 0 ? num+""
                : (xInt == 1 ) ? "x + "+num
                : xInt+"x + "+num;
        System.out.println(answer);




    }
}

class Solution3 {
    public String solution(String polynomial) {
        int xCount = 0;
        int num = 0;
        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) {
                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "") + (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
    }
}
