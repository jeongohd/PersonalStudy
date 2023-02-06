package Programmers.Level_1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 약수의 합
// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

public class SumOfAliquot {
    public static void main(String[] args) {

        int n = 100;
        int sqrt = (int)(Math.sqrt(n));
        System.out.println(sqrt);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n/i);
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        int sum = 0;
        for (int v : list) {
            sum+=v;
        }




    }

    public int solution(int num) {
        int answer = 0;
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0) answer += i;
        }
        return answer+num;
    }
}
