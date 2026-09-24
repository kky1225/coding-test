package programmers.level1.p51_60;

public class Problem55 {
    public static void main(String[] args) {
        Solution55 s = new Solution55();
        System.out.println(s.solution(new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}}, 1, 1));
        System.out.println(s.solution(new String[][]{{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}}, 0, 1));
    }
}

/**
 * 문제: [PCCE 기출문제] 9번 / 이웃한 칸
*/
class Solution55 {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];

        if (h > 0) {
            if (color.equals(board[h - 1][w])) answer++;
        }

        if (h < board.length - 1) {
            if (color.equals(board[h + 1][w])) answer++;
        }

        if (w > 0) {
            if (color.equals(board[h][w - 1])) answer++;
        }

        if (w < board[0].length - 1) {
            if (color.equals(board[h][w + 1])) answer++;
        }

        return answer;
    }

}
