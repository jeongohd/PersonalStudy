package LambdaAndStream;

public class Lambda01 {

    public static void main(String[] args) {

//        Object obj = (a,b) -> a > b ? a : b; // 람다식
//        Object obj = new Object(){
//            int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };
//        int value = obj.max(3,5); Object객체 안에는 max라는 메소드가 정의되어있지 않아 오류.

        // 람다식(익명객체)를 다루기 위한 참조변수의 타입은 함수형 인터페이스로 함.
        Myfunction2 f = (a,b) -> a > b ? a : b; // 람다식. 익명객체.
        int value = f.max(3, 5);
        System.out.println("value = "+ value);
    }

}
@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상메소드만 가져야 함.
interface Myfunction2 {
    int max(int a, int b);
}


