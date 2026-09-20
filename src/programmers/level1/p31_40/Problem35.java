package programmers.level1.p31_40;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem35 {
    public static void main(String[] args) {
        Solution35 s = new Solution35();
        System.out.println(Arrays.toString(s.solution("banana")));
        System.out.println(Arrays.toString(s.solution("foobar")));
    }
}

/**
 * 문제: 가장 가까운 같은 글자
*/
class Solution35 {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int[] answer = new int[s.length()];

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int index = map.get(c);
                answer[i] = i - index;
            } else {
                answer[i] = -1;
            }

            map.put(c, i++);
        }

        return answer;
    }
}
