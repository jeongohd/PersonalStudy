package Programmers.Level_0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int n = 15;

        List<Integer> list= IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
        System.out.println(list);

        System.out.println("13".contains("3"));


        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 3 == 0) || String.valueOf(list.get(i)).contains("3")) {
                list.remove(list.get(i));
                int last = list.get(list.size()-1)+1;
                System.out.println(last);

                String lastStr = last+"";
                boolean flag = true;
                while (flag) {
                    if(last%3==0){
                        last++;
                    } else if (lastStr.contains("3")) {
                        lastStr = (Integer.parseInt(lastStr)+1)+"";
                        last++;
                    } else {
                        flag = false;
                    }
//                    System.out.println(last);
                }
                list.add(last);

//                int last = list.get(list.size()) + 1;
//                String lastStr = last+"";
//                while (lastStr.contains("3") || (last % 3 == 0)) {
//                    last++;
//                    lastStr = (Integer.parseInt(lastStr)+1)+"";
//                    System.out.println(last);
//                    System.out.println(lastStr);
//                }
//                list.add(last);

//                for (int j = 0; j < list.size() - 1; j++) {
//
//                    int k = 1;
//                    int last = list.get(list.size()-1) + k;
//                    String strLast = last +"";
//                    if (!(last % 3 == 0 || strLast.contains("3"))) {
//                        list.add(last);
//                    } else {
//                        k++;
//                    }
//                }
            }
        }
        System.out.println(list);


    }
}
