package programmers.level2.p11_20;

public class Problem12 {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        System.out.println(s.solution(4));
        System.out.println(s.solution(3));
    }
}

/**
 * 문제: 멀리 뛰기
*/
class Solution12 {
    public long solution(int n) {
        if (n < 3) {
            return n;
        }

        long a = 1;
        long b = 2;
        long answer = 0;

        for (int i = 3; i <= n; i++) {
            answer = (a + b) % 1234567;
            a = b;
            b = answer;
        }

        return answer;
    }
}
