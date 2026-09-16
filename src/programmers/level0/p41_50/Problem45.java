package programmers.level0.p41_50;

public class Problem45 {
    public static void main(String[] args) {
        Solution45 s = new Solution45();
        System.out.println(s.solution(-4, 7, true));
        System.out.println(s.solution(-4, 7, false));
    }
}

/**
 * 문제: flag에 따라 다른 값 반환하기
 */
class Solution45 {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
