package programmers.level2.p1_10;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
        System.out.println(s.solution(new int[] {1, 2}, new int[] {3, 4}));
    }
}

/**
 * 문제: 최솟값 만들기
*/
class Solution3 {
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            answer = answer + A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}
