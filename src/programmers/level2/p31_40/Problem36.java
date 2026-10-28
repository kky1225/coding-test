package programmers.level2.p31_40;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Problem36 {
    public static void main(String[] args) {
        Solution36 s = new Solution36();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 2, 3})));
    }
}

/**
 * 문제: 주식가격
*/
class Solution36 {
    public int[] solution(int[] prices) {
        int size = prices.length;
        int[] answer = new int[size];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int top = stack.pop();
                answer[top] = i - top;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            answer[top] = (size - 1) - top;
        }

        return answer;
    }
}
