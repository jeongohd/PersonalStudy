package Programmers.Level_1;

// 정수 제곱근 판별
// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
public class TellSquareRoot {
    public static void main(String[] args) {

        int n = 121;
        String str = String.valueOf(Math.sqrt(n));
        int idx = str.indexOf(".")+1;
        if (str.substring(idx).length() > 1 && str.substring(idx) != 0 + "") {
            System.out.println(-1);
        } else {
            System.out.println(Math.pow((int)(Math.sqrt(n))+1,2));
        }

    }
    public long solution(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }
}
