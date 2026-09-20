package programmers.level1.p31_40;

import java.util.Arrays;

public class Problem32 {
    public static void main(String[] args) {
        Solution32 s = new Solution32();
        System.out.println(s.solution(new int[]{1,3,2,5,4}, 9));
        System.out.println(s.solution(new int[]{2,2,3,3}, 10));
    }
}

/**
 * 문제: 예산
*/
class Solution32 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;

        for (int i : d) {
            if (budget < i) {
                break;
            }
            budget -= i;
            answer++;
        }

        return answer;
    }
}
