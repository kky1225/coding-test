package programmers.level2.p21_30;

import java.util.ArrayList;
import java.util.List;

public class Problem27 {
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        System.out.println(s.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        System.out.println(s.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        System.out.println(s.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(s.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        System.out.println(s.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
        System.out.println(s.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}

/**
 * 문제: [1차] 캐시
*/
class Solution27 {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        List<String> cache = new ArrayList<>();

        int answer = 0;
        for (String city : cities) {
            String lowerCity = city.toLowerCase();
            if (cache.remove(lowerCity)) {
                answer += 1;
            } else {
                answer += 5;
                if (cache.size() >= cacheSize) {
                    cache.removeFirst();
                }
            }
            cache.add(lowerCity);
        }
        return answer;
    }
}
