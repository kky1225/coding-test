package programmers.level2.p1_10;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("1 2 3 4"));
        System.out.println(s.solution("-1 -2 -3 -4"));
        System.out.println(s.solution("-1 -1"));
    }
}

/**
 * 문제: 최댓값과 최솟값
*/
class Solution2 {
    public String solution(String s) {
        String[] parts = s.split(" ");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(arr);

        return arr[0] + " " + arr[arr.length - 1];
    }
}
