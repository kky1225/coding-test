package programmers.level1.p41_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem47 {
    public static void main(String[] args) {
        Solution47 s = new Solution47();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(s.solution(new int[]{1,3,2,4,2})));
    }
}

/**
 * 문제: 모의고사
*/
class Solution47 {
    public int[] solution(int[] answers) {
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        } ;
        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                if (patterns[j][i % patterns[j].length] == answers[i]) {
                    scores[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
