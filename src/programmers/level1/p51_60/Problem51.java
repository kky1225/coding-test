package programmers.level1.p51_60;

import java.util.Arrays;

public class Problem51 {
    public static void main(String[] args) {
        Solution51 s = new Solution51();
        System.out.println(s.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}

/**
 * 문제: 과일 장수
*/
class Solution51 {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int answer = 0;
        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }

        return answer;
    }
}
