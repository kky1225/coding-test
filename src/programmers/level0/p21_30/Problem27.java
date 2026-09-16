package programmers.level0.p21_30;

import java.util.Arrays;

public class Problem27 {
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        System.out.println(s.solution(1234));
        System.out.println(s.solution(930211));
    }
}

/**
 * 문제: 자릿수 더하기
 */
class Solution27 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
