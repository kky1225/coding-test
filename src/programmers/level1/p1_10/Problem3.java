package programmers.level1.p1_10;

public class Problem3 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(12));
        System.out.println(s.solution(5));
    }
}

/**
 * 문제: 약수의 합
*/
class Solution3 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
