package programmers.level2.p1_10;

public class Problem6 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.solution(15));
    }
}

/**
 * 문제: 숫자의 표현
*/
class Solution6 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;

                if (sum >= n) {
                    if (sum == n) {
                        answer++;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
