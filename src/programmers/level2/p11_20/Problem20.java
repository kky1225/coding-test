package programmers.level2.p11_20;

import java.util.Arrays;

public class Problem20 {
    public static void main(String[] args) {
        Solution20 s = new Solution20();
        System.out.println(Arrays.toString(s.solution(3, 2, 5)));
        System.out.println(Arrays.toString(s.solution(4, 7, 14)));
    }
}

/**
 * 문제: n^2 배열 자르기
*/
class Solution20 {
    public int[] solution(int n, long left, long right) {
        int[] array = new int[Math.toIntExact(right - left + 1)];
        int idx = 0;
        for (long i = left; i <= right; i++) {
            long col = i % n;
            long row = i / n;

            array[idx++] = Math.toIntExact(Math.max(row, col) + 1);
        }

        return array;
    }
}
