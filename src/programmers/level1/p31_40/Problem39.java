package programmers.level1.p31_40;

import java.util.Arrays;

public class Problem39 {
    public static void main(String[] args) {
        Solution39 s = new Solution39();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}

/**
 * 문제: K번째수
*/
class Solution39 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] copy = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(copy);
            answer[i] = copy[commands[i][2] - 1];
        }

        return answer;
    }
}
