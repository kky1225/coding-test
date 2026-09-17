package programmers.level1.p1_10;

import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        Solution9 s = new Solution9();
        System.out.println(s.solution(new int[] {1,2,3,4}));
        System.out.println(s.solution(new int[] {5, 5}));
    }
}

/**
 * 문제: 평균 구하기
*/
class Solution9 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElseThrow();
    }
}
