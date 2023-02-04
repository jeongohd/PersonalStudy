package Programmers.Level_0;

// 옹일이
// 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
// 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
// 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
public class Babble {
    public static void main(String[] args) {
        String[] ms = {"aya", "ye", "woo", "ma"};
        String[] str = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        int answer = 0;
        for(int i =0; i<str.length; i++) {
            String babbling = str[i];
            String[] babArr = babbling.split("aya|ye|woo|ma");
            if(babArr.length == 0) {
                answer++;
            }
        }
        System.out.println(answer);


    }

    public int solution(String[] babbling) {
        int answer = 0;

        for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].isEmpty()) {
                answer = answer + 1;
            }
        }

        return answer;
    }

}