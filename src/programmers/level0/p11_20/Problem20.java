package programmers.level0.p11_20;

import java.util.Arrays;
import java.util.List;

public class Problem20 {
    public static void main(String[] args) {
        Solution20 s = new Solution20();
        System.out.println(s.solution("bus"));
        System.out.println(s.solution("nice to meet you"));
    }
}

/**
 * 문제: 모음 제거
*/
class Solution20 {
    public String solution(String my_string) {
        List<String> list = Arrays.asList("a", "e", "i", "o", "u");
        StringBuilder sb = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (!list.contains(String.valueOf(c))) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
