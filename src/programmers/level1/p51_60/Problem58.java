package programmers.level1.p51_60;

import java.util.HashMap;
import java.util.Map;

public class Problem58 {
    public static void main(String[] args) {
        Solution58 s = new Solution58();
        System.out.println(s.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(s.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(s.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}

/**
 * 문제: 완주하지 못한 선수
*/
class Solution58 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        return map.keySet().stream().filter(i -> map.get(i) > 0).findFirst().orElse("");
    }
}
