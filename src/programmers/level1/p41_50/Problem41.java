package programmers.level1.p41_50;

import java.util.*;

public class Problem41 {
    public static void main(String[] args) {
        Solution41 s = new Solution41();
        System.out.println(Arrays.toString(s.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
        System.out.println(Arrays.toString(s.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
    }
}

/**
 * 문제: 명예의 전당 (1)
*/
class Solution41 {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            if (queue.size() < k) {
                queue.offer(score[i]);
            } else {
                if (queue.peek() < score[i]) {
                    queue.poll();
                    queue.offer(score[i]);
                }
            }

            answer[i] = queue.peek();
        }
        return answer;
    }
}
