package programmers.level0.p1_10;

import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        Solution9 s = new Solution9();
        System.out.println(s.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(s.solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}

/**
 * 문제: 배열의 평균값
*/
class Solution9 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
