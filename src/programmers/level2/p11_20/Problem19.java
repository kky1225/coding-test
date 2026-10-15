package programmers.level2.p11_20;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem19 {
    public static void main(String[] args) {
        Solution19 s = new Solution19();
        System.out.println(s.solution("[](){}"));
        System.out.println(s.solution("}]()[{"));
        System.out.println(s.solution("[)(]"));
        System.out.println(s.solution("}}}"));
    }
}

/**
 * 문제: 할인 행사
*/
class Solution19 {
    public int solution(String s) {
        int start = 0;
        int answer = 0;

        while (start < s.length()) {
            String change = s.substring(start) + s.substring(0, start);
            if (isRightString(change)) {
                answer++;
            }
            start++;
        }

        return answer;
    }

    private boolean isRightString(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}
