package programmers.level2.p31_40;

import java.util.*;

public class Problem40 {
    public static void main(String[] args) {
        Solution40 s = new Solution40();
        System.out.println(Arrays.toString(s.solution(new int[] {180, 5000, 10, 600}, new String[] {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"})));
        System.out.println(Arrays.toString(s.solution(new int[] {120, 0, 60, 591}, new String[] {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"})));
        System.out.println(Arrays.toString(s.solution(new int[] {1, 461, 1, 10}, new String[] {"00:00 1234 IN"})));
    }
}

/**
 * 문제: 주차 요금 계산
*/
class Solution40 {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> time = new HashMap<>();
        Map<String, Integer> total = new TreeMap<>();

        for (String record : records) {
            String[] split = record.split(" ");
            int now = transTime(split[0]);

            if ("IN".equals(split[2])) {
                time.put(split[1], now);
            } else {
                int in = time.remove(split[1]);
                total.put(split[1], total.getOrDefault(split[1], 0) + now - in);
            }
        }

        int end = 23 * 60 + 59;
        for (String key : time.keySet()) {
            total.put(key, total.getOrDefault(key, 0) + end - time.get(key));
        }

        int[] answer = new int[total.size()];
        int i = 0;
        for (String key : total.keySet()) {
            int t = total.get(key);
            if (t <= fees[0]) {
                answer[i++] = fees[1];
                continue;
            }

            int remain = t - fees[0];
            int p = (remain / fees[2]) * fees[3] + fees[1];
            if (remain % fees[2] > 0) {
                p += fees[3];
            }

            answer[i++] = p;
        }

        return answer;
    }

    private int transTime(String time) {
        String hour = time.split(":")[0];
        String minute = time.split(":")[1];

        return Integer.parseInt(hour) * 60 + Integer.parseInt(minute);
    }
}
