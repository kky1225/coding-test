package programmers.level2.p21_30;

import java.util.Arrays;

public class Problem22 {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        System.out.println(s.solution(new int[] {3, 0, 6, 1, 5}));
    }
}

/**
 * 문제: 의상
*/
class Solution22 {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int answer = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] <= i + 1) {
                answer = citations[i];
            }
        }

        return answer;
    }
}
