package Programmers.Level_1;


// 가운데 글자 가져오기
// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
// 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
public class GetMiddleString {
    public static void main(String[] args) {
        String s = "qwer";
        String answer = "";
        if (s.length() % 2 != 0) {
            answer = s.charAt(s.length() / 2)+"";
        } else {
            answer += s.charAt((s.length() / 2)-1)+"";
            answer += s.charAt((s.length() / 2))+"";
        }
        System.out.println(answer);
    }
    String getMiddle(String word){
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
    // len 5
    // substring(2, 3)
    // len 6
    // substring(2, 4)
}
