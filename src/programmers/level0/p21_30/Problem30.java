package programmers.level0.p21_30;

public class Problem30 {
    public static void main(String[] args) {
        Solution30 s = new Solution30();
        System.out.println(s.solution(2, 10));
        System.out.println(s.solution(7, 15));
    }
}

/**
 * 문제: 세균 증식
 */
class Solution30 {
    public int solution(int n, int t) {
        for (int i = 1; i <= t; i++) {
            n *= 2;
        }

        return n;
    }
}
