package programmers.level1.p61_70;

import java.util.Stack;

public class Problem61 {
    public static void main(String[] args) {
        Solution61 s = new Solution61();
        System.out.println(s.solution(new int[][]{{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}}, new int[] {1,5,3,5,1,2,1,4}));
    }
}

/**
 * 문제: 크레인 인형뽑기 게임
*/
class Solution61 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] > 0) {
                    int prev = 0;
                    if (!stack.isEmpty()) {
                        prev = stack.peek();
                    }

                    if (prev == board[i][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][move - 1]);
                    }

                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
