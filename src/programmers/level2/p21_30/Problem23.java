package programmers.level2.p21_30;

import java.util.Arrays;

public class Problem23 {
    public static void main(String[] args) {
        Solution23 s = new Solution23();
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}})));
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}})));
    }
}

/**
 * 문제: 의상
*/
class Solution23 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr2[0].length; k++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    answer[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
        return answer;
    }
}
