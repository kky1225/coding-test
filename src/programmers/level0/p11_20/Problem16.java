package programmers.level0.p11_20;

public class Problem16 {
    public static void main(String[] args) {
        Solution16 s = new Solution16();
        System.out.println(s.solution(10, 3));
        System.out.println(s.solution(64, 6));
    }
}

/**
 * 문제: 양꼬치
*/
class Solution16 {
    public int solution(int n, int k) {
        return n * 12000 + (k - n / 10) * 2000;
    }
}
