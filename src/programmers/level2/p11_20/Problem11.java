package programmers.level2.p11_20;

import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        Solution11 s = new Solution11();
        System.out.println(s.solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(s.solution(4, new int[] {1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(s.solution(2, new int[] {1, 1, 1, 1, 2, 2, 2, 3}));
    }
}

/**
 * 문제: 귤 고르기
*/
class Solution11 {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        List<Integer> sorted = map.keySet().stream().sorted(Comparator.comparingInt(map::get)).toList().reversed();

        int answer = 0;
        for (int s : sorted) {
            if (k <= 0) {
                break;
            }

            answer++;
            k -= map.get(s);
        }
        return answer;
    }
}
