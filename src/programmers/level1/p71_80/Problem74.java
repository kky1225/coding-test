package programmers.level1.p71_80;

import java.util.HashMap;
import java.util.Map;

public class Problem74 {
    public static void main(String[] args) {
        Solution74 s = new Solution74();
        System.out.println(s.solution(new String[]{"muzi", "ryan", "frodo", "neo"}, new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}));
        System.out.println(s.solution(new String[]{"joy", "brad", "alessandro", "conan", "david"}, new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"}));
        System.out.println(s.solution(new String[]{"a", "b", "c"}, new String[]{"a b", "b a", "c a", "a c", "a c", "c a"}));

    }
}

/**
 * 문제: 가장 많이 받은 선물
*/
class Solution74 {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }

        int n =  friends.length;
        int[][] give = new int[n][n];
        int[] giftIndex = new int[n];

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giver = map.get(parts[0]);
            int receiver = map.get(parts[1]);

            give[giver][receiver]++;
            giftIndex[giver]++;
            giftIndex[receiver]--;
        }

        int[] next = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (give[i][j] > give[j][i]) {
                    next[i]++;
                } else if (give[i][j] < give[j][i]) {
                    next[j]++;
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        next[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        next[j]++;
                    }
                }
            }
        }

        int answer = Integer.MIN_VALUE;
        for (int count : next) {
            answer = Math.max(answer, count);
        }

        return answer;
    }
}
