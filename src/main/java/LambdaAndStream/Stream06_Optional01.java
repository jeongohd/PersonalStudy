package LambdaAndStream;

import java.util.Optional;

public class Stream06_Optional01 {
    public static void main(String[] args) {

        // Stream06_Optional01
        // 모든 타입의 객체를 저장할 수 있음. 간접적으로 null을 다룰 수 있음.

        String str = "abc";
        Optional<String> optVal = Optional.of(str);
//        Optional<String> optVal2 = Optional.of(null); NullPointerException 발생.
        Optional<String> optVal3 = Optional.ofNullable(null);

        Optional<String> optVal4 = null; // null로 초기화. 바람직하지 않음.
        Optional<String> optVal5 = Optional.empty(); // 빈 객체로 초기화.

//        System.out.println(optVal5.get()); // 들어있는 값이 null이면 오류.
        String str2 = "";
//        try {
//            str2 = optVal5.get();
//        } catch (Exception e) {
//            str2 = " ";
//        }

        str2 = optVal5.orElse("empty"); // 들어있는 값이 null 이면 empty
        str2 = optVal5.orElseGet(String::new);
        System.out.println("str2 : "+str2);









    }
}
