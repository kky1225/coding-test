package programmers.level0.p21_30;

public class Problem29 {
    public static void main(String[] args) {
        Solution29 s = new Solution29();
        System.out.println(s.solution(144));
        System.out.println(s.solution(976));
    }
}

/**
 * 문제: 제곱수 판별하기
 */
class Solution29 {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n ? 1 : 2;
    }
}
