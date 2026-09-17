package programmers.level1.p11_20;

public class Problem13 {
    public static void main(String[] args) {
        Solution13 s = new Solution13();
        System.out.println(s.solution(10));
        System.out.println(s.solution(12));
    }
}

/**
 * 문제: 나머지가 1이 되는 수 찾기
*/
class Solution13 {
    public int solution(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0;
    }
}
