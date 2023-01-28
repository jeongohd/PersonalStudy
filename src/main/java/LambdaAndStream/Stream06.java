package LambdaAndStream;

import java.io.File;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream06 {
    public static void main(String[] args) {


        // 중간연산 2

        // map - 스트림의 요소 변환.
        // peek - 중간 작업 결과 확인할 때 사용.
        // peek 중간연산(스트림 소비 x) foreach 최종연산
        File[] fileArr = {new File("Ex1.java")
                , new File("Ex1.bak")
                , new File("Ex2.java")
                , new File("Ex1")
                , new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fileArr);
        fileStream.map(File::getName).filter(v->v.indexOf(".")!=-1)
                .peek(s-> System.out.printf("file name : %s%n", s))
                .map(String::toLowerCase).map(v->v.substring(v.indexOf(".")+1))
                .peek(s-> System.out.printf("extension : %s%n", s))
                .distinct()
                .forEach(System.out::println);



        // flatMap - 배열들을 하나의 스트림으로 합칠 경우. 각 요소가 배열일 경우 한 스트림으로 합칠 때 사용.
        Stream<String[]> strArrStrm = Stream.of (
                new String[]{"abc", "def", "jkl"}
                , new String[]{"ABC", "DEF", "JKL"}
        );
//        Stream<Stream<String>> streamStream = strArrStrm.map(Arrays::stream); 스트림의 스트림.
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream); // strArrStrm.flatMap((f)->Arrays.stream(f));
        strStrm.map(String::toLowerCase)
                .distinct()
                .peek(i-> System.out.println(i))
                .sorted()
                .forEach(System.out::println);
        System.out.println();


        String[] lineArr = {"Believe or not It is true", "Do or do not There is no try"};
        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) // " +" : 하나 이상의 공백 (정규식)
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);


    }
}
