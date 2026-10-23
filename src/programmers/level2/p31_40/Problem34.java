package programmers.level2.p31_40;

import java.util.PriorityQueue;

public class Problem34 {
    public static void main(String[] args) {
        Solution34 s = new Solution34();
        System.out.println(s.solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
    }
}

/**
 * 문제: 더 맵게
*/
class Solution34 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville) {
            queue.offer(s);
        }

        int answer = 0;
        while (queue.peek() < K) {
            if (queue.size() < 2) {
                return -1;
            }

            int newK = queue.poll() + queue.poll() * 2;
            queue.offer(newK);
            answer++;
        }
        return answer;
    }
}
