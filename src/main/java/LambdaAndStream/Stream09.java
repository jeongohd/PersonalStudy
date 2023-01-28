package LambdaAndStream;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

class Student2 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public Student2(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    public boolean isMale() {
        return isMale;
    }

    public String toString() {
        return String.format("[%s, %s, %d학년%d반, %3d점]"
                , name, isMale ? "남" : "여", hak, ban, score);
    }

    // groupingBy()에서 사용.
    enum Level {HIGH, MID, LOW} // 성적을 상, 중, 하 세 단계로 분류.

}


public class Stream09 {

    public static void main(String[] args) {

        /*
            partitionBy() - 스트림을 2분할
            groupBy() - 스트림을 n분할
        */

        Student2[] stuArr = {
                new Student2("나지혜", true, 1, 1, 300)
                , new Student2("김지혜", false, 1, 1, 250)
                , new Student2("윤은희", true, 1, 3, 150)
                , new Student2("박대기", true, 1, 2, 50)
                , new Student2("이개경", false, 2, 1, 200)
                , new Student2("냉동기", true, 1, 3, 150)
                , new Student2("온도계", true, 2, 1, 50)
                , new Student2("김기훈", false, 2, 2, 300)
                , new Student2("환기니", true, 2, 2, 250)
                , new Student2("이광복", false, 2, 1, 200)
                , new Student2("바매섭", true, 2, 1, 100)
                , new Student2("구리나", true, 2, 3, 150)
        };

        System.out.println("1. 단순분할(성별로 분할)");
        Map<Boolean, List<Student2>> stuBySex
                = Stream.of(stuArr).collect(partitioningBy(Student2::isMale));
                



    }
}
