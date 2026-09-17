package programmers.level1.p1_10;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.println(Arrays.toString(s.solution(12345)));
    }
}

/**
 * 문제: 자연수 뒤집어 배열로 만들기
*/
class Solution5 {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}
