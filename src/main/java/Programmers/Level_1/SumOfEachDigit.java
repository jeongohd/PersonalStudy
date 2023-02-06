package Programmers.Level_1;
// 자릿수 더하기
// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
public class SumOfEachDigit {
    public static void main(String[] args) {

        int n = 456;
        int sum = 0;
        while (n >= 1) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println(sum);

    }
}
