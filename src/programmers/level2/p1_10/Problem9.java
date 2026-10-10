package programmers.level2.p1_10;

public class Problem9 {
    public static void main(String[] args) {
        Solution9 s = new Solution9();
        System.out.println(s.solution(3));
        System.out.println(s.solution(5));
    }
}

/**
 * 문제: 피보나치 수
*/
class Solution9 {
    public int solution(int n) {
        int[] sums = new int[n + 1];
        sums[0] = 1;
        sums[1] = 1;

        for (int i = 2; i < n; i++) {
            sums[i] = (sums[i - 1] + sums[i - 2]) % 1234567;
        }

        return sums[n - 1];
    }
}
