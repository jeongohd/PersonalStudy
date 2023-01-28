package Programmers.Level_0;


// 문자열 밀기
// 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
// 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고
// 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

public class MoveString {
    public static void main(String[] args) {
        String A = "apple";
        String B = "eppla";
        System.out.println(moveString1(A, B));

        moveString2(A, B);
    }

    private static void moveString2(String A, String B) {
        String b = B.repeat(2);
        B.indexOf(A);
    }

    private static int moveString1(String A, String B) {
        int answer = 0;
        String tA = A;
        for (int i = 0; i < A.length(); i++) {
            if (tA.equals(B)) {
                return answer;
            }
            String a = tA.substring(tA.length() - 1);
            tA = a + tA.substring(0, tA.length() - 1); // e + appl -> l + eapp -> p + leap -> p + plea -> a + pple
            answer++;
            // 문자열의 맨 끝에 문자를 변수에 담아 활용.
        }
        return -1;
    }




}
