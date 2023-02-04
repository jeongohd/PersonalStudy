package Programmers.Level_0;

// 유한소수 판별하기
// 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
// 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
// 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
// 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
// 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
public class TellFiniteDecimal {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;

        int t = b / sol(a, b);

        while (t != 1) {
            if (t % 2 == 0) {
                t /= 2;
            } else if (t % 5 == 0) {
                t /= 5;
            } else {
                System.out.println(2);
                return;
            }
        }
        System.out.println(1);
    }

    public static int sol(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return sol(b,a%b);
        }
    }
}

