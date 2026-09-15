package programmers.level0.p1_10;

public class Problem8 {
    public static void main(String[] args) {
        Solution8 s = new Solution8();
        System.out.println(s.solution(7, 10));
        System.out.println(s.solution(4, 12));
    }
}

/**
 * 문제: 피자 나눠 먹기 (3)
*/
class Solution8 {
    public int solution(int slice, int n) {
        if (slice >= n) {
            return 1;
        }

        return (n / slice) + (n % slice > 0 ? 1 : 0);
    }
}
