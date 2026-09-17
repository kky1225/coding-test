package programmers.level1.p11_20;

public class Problem14 {
    public static void main(String[] args) {
        Solution14 s = new Solution14();
        System.out.println(s.solution(new int[] {4, 7, 12}, new boolean[] {true, false, true}));
        System.out.println(s.solution(new int[] {1, 2, 3}, new boolean[] {false, false, true}));
    }
}

/**
 * 문제: 음양 더하기
*/
class Solution14 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
