package programmers.level1.p61_70;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Problem67 {
    public static void main(String[] args) {
        Solution67 s = new Solution67();
        System.out.println(Arrays.toString(s.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"})));
    }
}

/**
 * 문제: 달리기 경주
*/
class Solution67 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int callingRank = map.get(calling);
            int prevCallingRank = callingRank - 1;

            map.put(players[callingRank], prevCallingRank);
            map.put(players[prevCallingRank], callingRank);

            String temp = players[callingRank];
            players[callingRank] = players[prevCallingRank];
            players[prevCallingRank] = temp;
        }

        return players;
    }
}
