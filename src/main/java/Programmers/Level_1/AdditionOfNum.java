package Programmers.Level_1;


// 약수의 개수와 덧셈
// 두 정수 left와 right가 매개변수로 주어집니다.
// left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
// 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
public class AdditionOfNum {
    public static void main(String[] args) {

        int left = 13;
        int right = 17;

        /** Ideal way **/
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if(i % Math.sqrt(i) == 0) answer-=i; // 제곱수인 경우 약수의 갯수는 홀수
            else answer+=i;
        }
        System.out.println("answer = " + answer);

        /** 2 way **/
//        int[] ints = IntStream.rangeClosed(left,right).toArray();
//        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
//
//        int sum = IntStream.rangeClosed(left,right).sum();
//        System.out.println("sum = " + sum);
//
//        for (int i = 0; i < ints.length; i++) {
//            int tem = 1;
//            int cnt = 1;
//            while (tem < ints[i]) {
//                if (ints[i] % tem == 0) {
//                    cnt++;
//                }
//                tem++;
//            }
//            System.out.println("cnt : "+ cnt);
//            if (cnt % 2 != 0) {
//                sum -= ints[i]*2;
//                System.out.println("ints[i] : "+ints[i]);
//            }
//            tem=0;
//            cnt=0;
//        }
//        System.out.println(sum);
    }
}
