package LambdaAndStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Summary {
    public static void main(String[] args) {


        /** 1,2,3,4,5,6을 담고 있는 리스트를 만들고 역순 정렬 **/
//        List<Integer> list =  Arrays.asList(1, 2, 3, 4, 5, 6);
//        Collections.sort(list, (a,b)->b.compareTo(a));
//        System.out.println("numslist : "+ list);


        /** 1~100숫자를 리스트에 담고 2와 3의 배수를 제거하고 남은 수에 곱하기 2 **/
//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= 100; i++) {
//            list.add(i);
//        }
//        list.removeIf(v->v%2==0 || v%3==0);
//        System.out.println(list);
//        list.replaceAll(v-> v*2);
//        System.out.println(list);


        /** 메소드참조 **/
//        // 스트링을 인티저로 바꾸는 메소드참조 만들기
//        Function<String,Integer> f = Integer::parseInt;
//        System.out.println(f.apply("100")+300);
//        // 길이가 10인 인티저 배열 함수
//        Function<Integer, int[]> f2 = int[]::new;
//        System.out.println(Arrays.toString(f2.apply(10)));


        /** 3,1,6,7,2,3,6 정수 원소를 가진 리스트를 만들고 중복 제거 후, 정렬 한 뒤 리스트로 만들기 **/
//        List<Integer> list = Arrays.asList(3,1,6,7,2,3,6);
//        List<Integer> list2 = list.stream().distinct().sorted().collect(Collectors.toList());
//        System.out.println(list2);


        /** 스트림으로 로또번호 만들어서 리스트로 출력 **/
//        IntStream ints = new Random().ints(1, 46);
//        List list = ints.distinct().limit(6).sorted().boxed().collect(Collectors.toList()); // IntStream 은 boxed로 한 번 감싸서 리스트로 변환 가능.
//        System.out.println(list);


        /** "dd", "aaa", "CC", "cc", "b" 원소를 리스트에 담고 스트림으로 병렬처리하고 각 문자열의 합을 출력 **/
//        List<String> list = Arrays.asList("dd", "aaa", "CC", "cc", "b");
//        int sum = list.stream().parallel().mapToInt(v->v.length()).sum();
//        System.out.println("문자열의 합 : " + sum);


        /** 1~10 홀수만 스트림으로 출력 **/
//        List list = IntStream.iterate(1, v-> v+2).limit(5).boxed().collect(Collectors.toList());
//        System.out.println(list);
//        List<Integer> list2 = IntStream.rangeClosed(1, 10).filter(v -> v % 2 != 0).boxed().collect(Collectors.toList());
//        System.out.println(list2);




    }

}
