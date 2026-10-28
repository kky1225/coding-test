package programmers.level2.p31_40;

import java.util.*;

public class Problem39 {
    public static void main(String[] args) {
        Solution39 s = new Solution39();
        System.out.println(Arrays.toString(s.solution("KAKAO")));
        System.out.println(Arrays.toString(s.solution("TOBEORNOTTOBEORTOBEORNOT")));
        System.out.println(Arrays.toString(s.solution("ABABABABABABABAB")));
    }
}

/**
 * 문제: [3차] 압축
*/
class Solution39 {
    public int[] solution(String msg) {
        Map<String, Integer> dictionary = new HashMap<>();
        for (int i = 0; i <= 25; i++) {
            dictionary.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < msg.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(msg.charAt(i));

            for (int j = i + 1; j < msg.length(); j++) {
                String next = String.valueOf(msg.charAt(j));
                String str = sb.toString();

                if (dictionary.containsKey(str + next)) {
                    sb.append(next);
                    i++;
                } else {
                    dictionary.put(str + next, dictionary.size() + 1);
                    list.add(dictionary.get(str));
                    break;
                }
            }

            if (i == msg.length() - 1) {
                list.add(dictionary.get(sb.toString()));
            }
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
