package Programmers.Level_1;


import java.util.Arrays;


// 자릿수 뒤집어 배열 만들기
// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

public class MakeArray {
    public static void main(String[] args) {

        long n = 12345;
        String str = n+"";
        int k = 0;
        int[] ints = new int[str.length()];
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));
            ints[k] = Integer.parseInt(str.charAt(i)+"");
            k++;
        }
        System.out.println(Arrays.toString(ints));
    }

    public int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;
    }
}
