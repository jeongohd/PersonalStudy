package LambdaAndStream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream08_Collectors01 {
    public static void main(String[] args) {

        /*
            collect() - 최종연산   ****** 그룹별로 다루기위해 사용. ******
            Collector - 인터페이스
            Collectors - 클래스 (Collector 인터페이스 구현)
        */

        /*
            List<Student> names = stuStream.map(Student::getName).collect(Collectors.toList());
            ArrayList<String> list = names.stream().collect(Collectors.toCollection(ArrayList::new));
            Map<String, Person> map = personStream.collect(Collectors.toMap(p->p.getRegId(), p->p));


            ---------- counting(), summingInt() ----------

            long count = stuStream.count();
                == stuStream.collect(counting());


            long totalScore = stuStream.mapToInt(Student::getTotalScore).sum();
                == stuStream.collect(summingInt(Student::getTotalScore));

            OptionalInt topScore = studentStream.mapToInt(Student::getTotalScore).max());
            Optional<Student> topStudent = stuStream.max(Comparator.comparingInt(Student::getTotalScore));
            Optional<Student> topStudent = stuStream.collect(maxBy(Comparator.comparingInt(Student::getTotalScore)));


            ---------- reducing() ----------

            IntStream ints = new Random().ints(1,46).distinct().limit(6);

            long sum = ints.reduce(Integer::max);
                == ints.boxed().collect(reducing(0, (a,b) -> a + b));

            int grandtotal = stuStream.map(Student::getTotalScore).reduce(0, Integer::sum);
                == stuStream.collect(reducing(0, Student::getTotalScore, Integer::sum));


            ---------- joining() ----------

            stuStream.map(Student::getName).collect(joining());
            stuStream.map(Student::getName).collect(joining(","));
            stuStream.map(Student::getName).collect(joining(",", "[", "]"));
            stuStream.collect(joining(",")); Student의 toString()으로 결합.




        */

    }
}
