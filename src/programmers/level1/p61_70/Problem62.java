package programmers.level1.p61_70;

import java.util.HashMap;
import java.util.Map;

public class Problem62 {
    public static void main(String[] args) {
        Solution62 s = new Solution62();
        System.out.println(s.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5}));
        System.out.println(s.solution(new String[]{"TR", "RT", "TR"}, new int[] {7, 1, 3}));
    }
}

/**
 * 문제: 성격 유형 검사하기
*/
class Solution62 {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i = 0; i < choices.length; i++) {
            char type = survey[i].charAt(0);
            if (choices[i] > 4) {
                type = survey[i].charAt(1);
            }
            map.put(type, map.getOrDefault(type, 0) + Math.abs(4 - choices[i]));
        }

        StringBuilder sb = new StringBuilder();
        sb.append(map.get('R') >= map.get('T') ? "R" : "T");
        sb.append(map.get('C') >= map.get('F') ? "C" : "F");
        sb.append(map.get('J') >= map.get('M') ? "J" : "M");
        sb.append(map.get('A') >= map.get('N') ? "A" : "N");

        return sb.toString();
    }
}
