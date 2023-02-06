package Programmers.Level_1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 정수 내림차순 배치
// 함수 solution은 정수 n을 매개변수로 입력받습니다.
// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
public class ReverseOrder {
    public static void main(String[] args) {
        long n = 118372;
        String str = n+"";
        String tem = "";

        List<String> list = Stream.of(str.split("")).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (String v : list) {
            tem += v;
        }
        System.out.println(Long.parseLong(tem));

    }

    String res = "";
    public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }

    public long solution(long n) {
        return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString());
    }
}
