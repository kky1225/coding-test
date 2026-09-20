package programmers.level1.p41_50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem44 {
    public static void main(String[] args) {
        Solution44 s = new Solution44();
        System.out.println(Arrays.toString(s.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}})));
        System.out.println(Arrays.toString(s.solution(new String[]{"kali", "mari", "don"}, new int[]{11, 1, 55}, new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}})));
        System.out.println(Arrays.toString(s.solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}})));
    }
}

/**
 * 문제: 추억 점수
*/
class Solution44 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (String s : photo[i]) {
                if (map.containsKey(s)) {
                    answer[i] += map.getOrDefault(s, 0);
                }
            }
        }
        return answer;
    }
}
