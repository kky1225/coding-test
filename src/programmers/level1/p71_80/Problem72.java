package programmers.level1.p71_80;

import java.util.*;
import java.util.stream.Collectors;

public class Problem72 {
    public static void main(String[] args) {
        Solution72 s = new Solution72();
        System.out.println(Arrays.toString(s.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));
        System.out.println(Arrays.toString(s.solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 2)));
    }
}

/**
 * 문제: 신고 결과 받기
*/
class Solution72 {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String id : id_list) {
            map.put(id, 0);
        }

        Set<String> set = new HashSet<>(Arrays.asList(report));
        for (String r : set) {
            String[] parts = r.split(" ");
            map.put(parts[1], map.getOrDefault(parts[1], 0) + 1);
        }

        Set<String> StopSet = map.keySet().stream().filter(i -> map.get(i) >= k).collect(Collectors.toSet());

        int[] answer = new int[id_list.length];
        for (String r : set) {
            String[] parts = r.split(" ");

            if (StopSet.contains(parts[1])) {
                for (int i = 0; i < id_list.length; i++) {
                    if (id_list[i].equals(parts[0])) {
                        answer[i] += 1;
                        break;
                    }
                }
            }
        }

        return answer;
    }
}
