package Programmers.Level_0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 저주의 숫자
// 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
public class NumberOfCurse {
    public static void main(String[] args) {
        int n = 40;

        List<Integer> list= IntStream.rangeClosed(1, n)
                .filter(v->v%3!=0)
                .filter(v->!String.valueOf(v).contains("3"))
                .boxed().collect(Collectors.toList());
        System.out.println(list);

        int lastVal = list.get(list.size()-1)+1;
        System.out.println(lastVal);

        while (list.size() < n) {
            if (lastVal % 3 == 0 ) {
                lastVal++;
            } else if (String.valueOf(lastVal).indexOf("3") != -1){
                lastVal++;
            } else {
                list.add(lastVal);
                lastVal++;
            }
        }
        System.out.println(list);
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }
        return answer;
    }



    public int solution2(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer = get3xNationNumber(answer + 1);
        }
        return answer;
    }

    private int get3xNationNumber(int n) {
        if (n % 3 == 0) {
            return get3xNationNumber(n + 1);
        }
        if (String.valueOf(n).contains("3")) {
            return get3xNationNumber(n + 1);
        }
        return n;
    }
}



