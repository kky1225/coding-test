package programmers.level2.p21_30;

import java.util.*;

public class Problem24 {
    public static void main(String[] args) {
        Solution24 s = new Solution24();
        System.out.println(Arrays.toString(s.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(s.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }
}

/**
 * 문제: 기능개발
*/
class Solution24 {
    public int[] solution(int[] progresses, int[] speeds) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int prevProgress = 0;
        for (int i = 0; i < progresses.length; i++) {
            prevProgress = getNeedDay(prevProgress, progresses[i], speeds[i]);
            map.put(prevProgress, map.getOrDefault(prevProgress, 0) + 1);
        }

        return map.values().stream().mapToInt(Integer::intValue).toArray();
    }

    private int getNeedDay(int prevProgress, int progress, int speed) {
        int moreDays = (100 - progress) / speed;

        if ((100 - progress) % speed != 0) {
            moreDays += 1;
        }

        return Math.max(prevProgress, moreDays);
    }
}
