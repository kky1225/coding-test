package programmers.level2.p1_10;

import java.util.Stack;

public class Problem7 {
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        System.out.println(s.solution("baabaa"));
        System.out.println(s.solution("cdcd"));
    }
}

/**
 * 문제: 짝지어 제거하기
*/
class Solution7 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
                continue;
            }

            stack.push(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
