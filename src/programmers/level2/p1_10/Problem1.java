package programmers.level2.p1_10;

import java.util.Stack;

public class Problem1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution("()()"));
        System.out.println(s.solution("(())()"));
        System.out.println(s.solution(")()("));
        System.out.println(s.solution("(()("));
    }
}

/**
 * 문제: 올바른 괄호
*/
class Solution1 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
