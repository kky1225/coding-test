package programmers.level2.p21_30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem26 {
    public static void main(String[] args) {
        Solution26 s = new Solution26();
        System.out.println(s.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
        System.out.println(s.solution(new int[]{1, 2, 3, 1, 4}));
    }
}

/**
 * 문제: 롤케이크 자르기
*/
class Solution26 {
    public int solution(int[] topping) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : topping) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < topping.length - 1; i++) {
            set.add(topping[i]);

            if (map.get(topping[i]) == 1) {
                map.remove(topping[i]);
            } else {
                map.put(topping[i], map.get(topping[i]) - 1);
            }

            if (map.size() == set.size()) {
                answer++;
            }
        }

        return answer;
    }
}
