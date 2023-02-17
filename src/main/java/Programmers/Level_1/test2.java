package Programmers.Level_1;

// 푸드 파이트 대회 (런타임 에러)
public class test2 {
    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        // expected "111303111"

        String[] strs = {"","1","2","3"};
        String res = "";
        for (int i = 1; i < food.length; i++) {
            int tem = (int)food[i]/2;
            res+=strs[i].repeat(tem);
        }
        System.out.println(res);
        StringBuilder sb= new StringBuilder(res);
        String res2 = sb.reverse().toString();
        System.out.println(res + "0" + res2);


    }
}
