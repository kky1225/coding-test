package programmers.level0.p21_30;

import java.util.Arrays;

public class Problem26 {
    public static void main(String[] args) {
        Solution26 s = new Solution26();
        System.out.println(Arrays.toString(s.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(s.solution(5, new int[]{1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(s.solution(12, new int[]{2, 100, 120, 600, 12, 12})));
    }
}

/**
 * 문제: n의 배수 고르기
 */
class Solution26 {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}
