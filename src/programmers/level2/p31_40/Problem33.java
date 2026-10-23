package programmers.level2.p31_40;

import java.util.HashMap;
import java.util.Map;

public class Problem33 {
    public static void main(String[] args) {
        Solution33 s = new Solution33();
        System.out.println(s.solution("FRANCE", "french"));
        System.out.println(s.solution("handshake", "shake hands"));
        System.out.println(s.solution("aa1+aa2", "AAAA12"));
        System.out.println(s.solution("E=M*C^2", "e=m*c^2"));
    }
}

/**
 * 문제: [1차] 뉴스 클러스터링
*/
class Solution33 {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            if (Character.isLetter(str1.charAt(i)) && Character.isLetter(str1.charAt(i + 1))) {
                String key = str1.substring(i, i + 2);
                map1.put(key, map1.getOrDefault(key, 0) + 1);
            }
        }
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str2.length() - 1; i++) {
            if (Character.isLetter(str2.charAt(i)) && Character.isLetter(str2.charAt(i + 1))) {
                String key = str2.substring(i, i + 2);
                map2.put(key, map2.getOrDefault(key, 0) + 1);
            }
        }

        double hab = 0;
        double gyo = 0;

        for (String key : map1.keySet()) {
            gyo += Math.min(map1.get(key), map2.getOrDefault(key, 0));
            hab += Math.max(map1.get(key), map2.getOrDefault(key, 0));
        }
        for (String key : map2.keySet()) {
            if (!map1.containsKey(key)) {
                hab += map2.get(key);
            }
        }

        if (hab == 0) {
            return 65536;
        }

        return (int) ((gyo / hab) * 65536);
    }
}
