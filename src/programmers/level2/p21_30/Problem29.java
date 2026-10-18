package programmers.level2.p21_30;

import java.util.*;

public class Problem29 {
    public static void main(String[] args) {
        Solution29 s = new Solution29();
        System.out.println(Arrays.toString(s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(s.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(s.solution("{{20,111},{111}}")));
        System.out.println(Arrays.toString(s.solution("{{123}}")));
        System.out.println(Arrays.toString(s.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
    }
}

/**
 * 문제: 튜플
*/
class Solution29 {
    public int[] solution(String s) {
        String[] str = s.replace("{{", "").replace("}}", "").replace("},{", " ").split(" ");
        Arrays.sort(str, Comparator.comparing(String::length));

        Set<String> set = new LinkedHashSet<>();
        for (String string : str) {
            set.addAll(Arrays.asList(string.split(",")));
        }

        return set.stream().mapToInt(Integer::parseInt).toArray();
    }
}
