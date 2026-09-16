package programmers.level0.p31_40;

import java.util.Arrays;

public class Problem36 {
    public static void main(String[] args) {
        Solution36 s = new Solution36();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 100, -99, 1, 2, 3})));
    }
}

/**
 * 문제: 배열 두 배 만들기
 */
class Solution36 {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}
