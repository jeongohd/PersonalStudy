package Programmers.Level_1;

// [1차] 비밀지도
// 네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다.
// 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다.
// 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
public class SecretMap01 {
    public static void main(String[] args) {

        int n= 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        /** Integer.toBinaryString(10진수) (10진수 -> 2진수) **/
//        System.out.println(Integer.toBinaryString(0x1B)); // 11011
//        System.out.println(String
//                .format("%8s", Integer.toBinaryString(0x1B)).replace(" ", "0")); // 00011011

        /** String.format("%숫자s", 정수) **/
//        String ex = String.format("%16s", 1);
//        ex = ex.replaceAll(" ", "0");
//        System.out.println(ex);

        /** faster and more clean **/
        String[] answer = new String[n];
        String temp;
        for(int i = 0 ; i < n ; i++){
            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i])); // 16자리로 만들고
            temp = temp.substring(temp.length() - n); // temp.substring(16 - 6); =>  temp.substring(10);
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        /** clean **/
//        String[] result = new String[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//        }
//        System.out.println(Arrays.toString(result));
//        for (int i = 0; i < n; i++) {
//            result[i] = String.format("%" + n + "s", result[i]); // String.format(%6s, 111111) 6자리 채우기
//            result[i] = result[i].replaceAll("1", "#");
//            result[i] = result[i].replaceAll("0", " ");
//        }
//        System.out.println(Arrays.toString(result));



        /** mine **/
//        String[] arrStrs1 = new String[n];
//        String[] arrStrs2 = new String[n];
//
//        for (int i=0; i<arr1.length; i++) {
//            String tem1 = "";
//            String tem2 = "";
//            while (arr1[i] > 0) {
//                tem1 = (arr1[i] % 2) + tem1;
//                arr1[i] /= 2;
//            }
//            arrStrs1[i] = tem1;
//            while (arr2[i] > 0) {
//                tem2 = (arr2[i] % 2) + tem2;
//                arr2[i] /= 2;
//            }
//            arrStrs2[i] = tem2;
//
//            if (arrStrs1[i].length() != n) {
//                arrStrs1[i] = "0".repeat(n - arrStrs1[i].length()) + arrStrs1[i];
//            }
//            if (arrStrs2[i].length() != n) {
//                arrStrs2[i] = "0".repeat(n - arrStrs2[i].length()) + arrStrs2[i];
//            }
//        }
//        System.out.println(Arrays.toString(arrStrs1));
//        System.out.println(Arrays.toString(arrStrs2));
//
//        String[] ans = new String[n];
//
//        for (int i = 0; i < arrStrs1.length; i++) {
//            String tem = "";
//            for (int j = 0; j < arrStrs1[i].length(); j++) {
//                String[] strs1 = arrStrs1[i].split("");
//                String[] strs2 = arrStrs2[i].split("");
//                if (strs1[j].equals("0") && strs2[j].equals("0")) {
//                    tem += " ";
//                } else {
//                    tem += "#";
//                }
//            }
//            ans[i] = tem;
//            tem="";
//        }
//        System.out.println(Arrays.toString(ans));






    }
}
