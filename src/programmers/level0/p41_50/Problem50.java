package programmers.level0.p41_50;

public class Problem50 {
    public static void main(String[] args) {
        Solution50 s = new Solution50();
        System.out.println(s.solution(1.42));
        System.out.println(s.solution(69.32));
    }
}

/**
 * 문제: 정수 부분
 */
class Solution50 {
    public int solution(double flo) {
        return (int) flo;
    }
}
