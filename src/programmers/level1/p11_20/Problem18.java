package programmers.level1.p11_20;

import java.util.Arrays;

public class Problem18 {
    public static void main(String[] args) {
        Solution18 s = new Solution18();
        System.out.println(Arrays.toString(s.solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(s.solution(new int[]{10})));
    }
}

/**
 * 문제: 제일 작은 수 제거하기
*/
class Solution18 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }

        int min = Arrays.stream(arr).min().orElseThrow();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
