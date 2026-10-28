package programmers.level2.p31_40;

public class Problem37 {
    public static void main(String[] args) {
        Solution37 s = new Solution37();
        System.out.println(s.solution(437674, 3));
        System.out.println(s.solution(110011, 10));
    }
}

/**
 * 문제: k진수에서 소수 개수 구하기
*/
class Solution37 {
    public int solution(int n, int k) {
        int answer = 0;
        for (String s : Integer.toString(n, k).split("0")) {
            if (!s.isEmpty() && isPrimeNumber(Long.parseLong(s))) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isPrimeNumber(long n) {
        if (n <= 1) {
            return false;
        }

        int max = (int) Math.sqrt(n);
        for (int j = 2; j <= max; j++) {
            if (n % j == 0) {
                return false;
            }
        }

        return true;
    }
}
