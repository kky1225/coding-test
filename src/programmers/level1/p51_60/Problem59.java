package programmers.level1.p51_60;

import java.util.Stack;

public class Problem59 {
    public static void main(String[] args) {
        Solution59 s = new Solution59();
        System.out.println(s.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(s.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }
}

/**
 * 문제: 햄버거 만들기
*/
class Solution59 {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int[] rep = new int[] {1, 2, 3, 1};
        int answer = 0;

        for (int k : ingredient) {
            stack.push(k);
            boolean find = false;

            if (stack.size() > 3) {
                int idx = 0;
                for (int j = stack.size() - 4; j < stack.size(); j++) {
                    if (stack.get(j) != rep[idx++]) {
                        find = false;
                        break;
                    }

                    find = true;
                }
            }

            if (find) {
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                answer++;
            }
        }

        return answer;
    }
}
