package programmers.level1.p41_50;

import java.util.Arrays;

public class Problem50 {
    public static void main(String[] args) {
        Solution50 s = new Solution50();
        System.out.println(s.solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(s.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}

/**
 * 문제: 옹알이 (2)
*/
class Solution50 {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        String[] noWords = {"ayaaya", "yeye", "woowoo", "mama"};
        int answer = 0;

        for (String s : babbling) {
            if (Arrays.stream(noWords).anyMatch(s::contains)) {
                continue;
            }

            for (String word : words) {
                s = s.replace(word, " ");
            }

            if (s.trim().isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
