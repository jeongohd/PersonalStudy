package LambdaAndStream;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream05 {
    public static void main(String[] args) {

        // 중간연산 1

        // skip, limit
        IntStream ints = IntStream.rangeClosed(1,10); // 1 ~ 10
        ints.skip(4).limit(3).forEach(System.out::print); // 5 6 7
        System.out.println();

        // distinct, filter
        IntStream ints2 = IntStream.of(1, 2, 2, 3, 4, 5, 5, 5);
        ints2.distinct().forEach(System.out::print);
        System.out.println();

        IntStream ints3 = IntStream.rangeClosed(1, 10);
//        ints3.filter(i -> i%2!=0 && i%3!=0).forEach(System.out::print);
        ints3.filter(i -> i%2!=0).filter(i -> i%3!=0).forEach(System.out::print);


        // sorted
        Stream<Student> studentStream = Stream.of(
                new Student("ojg",3,300),
                new Student("ldn",1,200),
                new Student("sns",2,100),
                new Student("ees",2,150),
                new Student("gxx",3,290),
                new Student("dwz",3,180)
        );

//        studentStream.sorted(Comparator.comparing(Student::getBan).reversed() // 반별로 정렬.
        studentStream.sorted(Comparator.comparing((Student s) -> s.getBan()).reversed() // 람다로 변경.
                .thenComparing(Comparator.naturalOrder())) // 기본 정렬
                .forEach(System.out::println);

    }

}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    // 총점 내림차순을 기본 정렬로 함.
    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}

