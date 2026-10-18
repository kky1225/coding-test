package programmers.level2.p21_30;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Problem28 {
    public static void main(String[] args) {
        Solution28 s = new Solution28();
        System.out.println(s.solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(s.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}

/**
 * 문제: 프로세스
*/
class Solution28 {
    public int solution(int[] priorities, int location) {
        int maxPriority = Arrays.stream(priorities).max().getAsInt();
        int now = location;

        Queue<Integer> queue = new LinkedList<>();
        for (int priority : priorities) {
            queue.offer(priority);
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current != maxPriority) {
                queue.offer(current);
                now = now - 1 < 0 ? queue.size() - 1 :  now - 1;
            } else {
                answer++;
                if (!queue.isEmpty()) {
                    maxPriority = queue.stream().max(Integer::compareTo).get();
                }
                if (now == 0) {
                    break;
                }
                now--;
            }
        }

        return answer;
    }
}
