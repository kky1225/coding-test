package programmers.level2.p31_40;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem38 {
    public static void main(String[] args) {
        Solution38 s = new Solution38();
        System.out.println(s.solution(new int[] {4, 3, 1, 2, 5}));
        System.out.println(s.solution(new int[] {5, 4, 3, 2, 1}));
    }
}

/**
 * 문제: 택배상자
*/
class Solution38 {
    public int solution(int[] order) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 1; i <= order.length; i++) {
            if (order[answer] != i) {
                stack.push(i);
                continue;
            }

            answer++;

            while (!stack.isEmpty()) {
                if (order[answer] == stack.peek()) {
                    stack.pop();
                    answer++;
                } else {
                    break;
                }
            }
        }
        return answer;
    }
}
