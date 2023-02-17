package Programmers.Level_1;

// 푸드 파이트 대회
public class FoodFightFestival {
    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        // expected "111303111"


        /** cleaner **/
        String answer = "0";
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }
        System.out.println(answer);


        /** clean **/
//        StringBuilder builder = new StringBuilder();
//        for (int i=1; i<food.length; i++) {
//            int result = food[i] / 2;
//            builder.append(String.valueOf(i).repeat(result));
//        }
//        String answer = builder + "0";
//        System.out.println(answer + builder.reverse(););


        /** mine **/
//        String[] strs = {"","1","2","3","4","5","6","7","8","9"};
//        String res = "";
//        for (int i = 1; i < food.length; i++) {
//            int tem = (int)food[i]/2;
//            res+=strs[i].repeat(tem);
//        }
//        System.out.println(res);
//        StringBuilder sb= new StringBuilder(res);
//        String res2 = sb.reverse().toString();
//        System.out.println(res + "0" + res2);





    }


}
