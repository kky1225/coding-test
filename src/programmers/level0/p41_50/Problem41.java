package programmers.level0.p41_50;

public class Problem41 {
    public static void main(String[] args) {
        Solution41 s = new Solution41();
        System.out.println(s.solution(98, 2));
        System.out.println(s.solution(34, 3));
    }
}

/**
 * 문제: 수 조작하기 1
 */
class Solution41 {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}
