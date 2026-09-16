package programmers.level0.p21_30;

import java.util.Arrays;
import java.util.List;

public class Problem25 {
    public static void main(String[] args) {
        Solution25 s = new Solution25();
        System.out.println(s.solution(new String[] {"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"}));
        System.out.println(s.solution(new String[] {"n", "omg"}, new String[] {"m", "dot"}));
    }
}

/**
 * 문제: 배열의 유사도
 */
class Solution25 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s : s1) {
            for (String ss : s2) {
                if (s.equals(ss)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
