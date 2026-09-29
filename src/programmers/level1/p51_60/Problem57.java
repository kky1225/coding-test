package programmers.level1.p51_60;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem57 {
    public static void main(String[] args) {
        Solution57 s = new Solution57();
        System.out.println(Arrays.toString(s.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(s.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));
        System.out.println(Arrays.toString(s.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35})));
    }
}

/**
 * 문제: 로또의 최고 순위와 최저 순위
*/
class Solution57 {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> set = Arrays.stream(win_nums).boxed().collect(Collectors.toSet());
        int zeroCount = 0, matchCount = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }

            if (set.contains(lotto)) {
                matchCount++;
            }
        }

        int ranking = 7 - matchCount;
        return new int[]{Math.min(ranking - zeroCount, 6), Math.min(ranking, 6)};
    }
}
