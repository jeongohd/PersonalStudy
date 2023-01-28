package LambdaAndStream;

import java.util.function.Function;

public class MethodReference01 {

    // 하향 코드로 발전. 1 -> 2 -> 3

    // 1
    public Integer method(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        // 2. String 입력, Integer 출력
        Function<String, Integer> f = (String s) -> Integer.parseInt(s);

        // 3. 메소드 참조. 입력을 미리 알 수 있으니 쓸 필요 없음.
        // Function<String, Integer> f2 = 클래스이름::메소드이름.
        Function<String, Integer> f2 = Integer::parseInt;

        // 3 -> 2로 가는 연습
        // Function<String, Integer> f3 = (String s) -> Integer.parseInt(s);

        System.out.println(f2.apply("100")+200); // 300
    }
}
