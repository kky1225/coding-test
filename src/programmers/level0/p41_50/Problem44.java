package programmers.level0.p41_50;

import java.util.Arrays;

public class Problem44 {
    public static void main(String[] args) {
        Solution44 s = new Solution44();
        System.out.println(Arrays.toString(s.solution(new int[]{2, 1, 6}, 1)));
        System.out.println(Arrays.toString(s.solution(new int[]{5, 2, 1, 7, 5}, 3)));
    }
}

/**
 * 문제: n 번째 원소까지
 */
class Solution44 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}
