package Programmers.Level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// OX퀴즈
// 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
// 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.

public class OXquiz {
    public static void main(String[] args) {
        String[] strs = new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(Arrays.toString(oxquiz(strs)));

    }

    private static String[] oxquiz(String[] quiz) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i< quiz.length; i++){
            String str = quiz[i];
            String[] st = str.split(" ");
            int result = 0;
            for(int j=0; j<st.length; j++){
                if(st[j].equals("-")){
                    result = Integer.parseInt(st[j - 1]) - Integer.parseInt(st[j + 1]);
                }
                if(st[j].equals("+")){
                    result = Integer.parseInt(st[j - 1]) + Integer.parseInt(st[j + 1]);
                }
            }
            if(String.valueOf(result).equals(st[st.length-1])){
                list.add("O");
            } else {
                list.add("X");
            }
        }

        String[] res = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }

}
