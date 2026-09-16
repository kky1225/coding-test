package programmers.level0.p31_40;

import java.util.Arrays;

public class Problem38 {
    public static void main(String[] args) {
        Solution38 s = new Solution38();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 100, 99, 98}, 3)));
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 100, 99, 98}, 2)));
    }
}

/**
 * 문제: 조건에 맞게 수열 변환하기 3
 */
class Solution38 {
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 0) {
            return Arrays.stream(arr).map(i -> i + k).toArray();
        }
        return Arrays.stream(arr).map(i -> i * k).toArray();
    }
}
