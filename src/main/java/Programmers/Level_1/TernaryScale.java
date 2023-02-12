package Programmers.Level_1;

// 3진법 뒤집기
// 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
// 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.


public class TernaryScale {
    public static void main(String[] args) {
        int num= 45;
        String ans = "";
        /** 10진법 -> 3진법 **/
//        while (num > 0) {
//            ans = (num % 3) + ans;
//            num /= 3;
//        }
//        System.out.println(ans);


        while (num > 0) {
            ans += (num % 3) + "";
            num /= 3;
        }
        System.out.println(ans);

        /** 3진법(문자열) -> 10진법 **/
        int res = Integer.parseInt(ans, 3);
        System.out.println(res);
    }

    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();

        return Integer.parseInt(a,3);
    }
}
