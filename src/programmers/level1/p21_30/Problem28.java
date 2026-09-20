package programmers.level1.p21_30;

import java.util.Arrays;

public class Problem28 {
    public static void main(String[] args) {
        Solution28 s = new Solution28();
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})));
        System.out.println(Arrays.deepToString(s.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}})));
    }
}

/**
 * 문제: 행렬의 덧셈
*/
class Solution28 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
