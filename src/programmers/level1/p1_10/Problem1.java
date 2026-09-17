package programmers.level1.p1_10;

public class Problem1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(3, 5));
        System.out.println(s.solution(3, 3));
        System.out.println(s.solution(5, 3));
    }
}

/**
 * 문제: 두 정수 사이의 합
*/
class Solution1 {
    public long solution(int a, int b) {
        long answer = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }

        return answer;
    }
}
