package programmers.level2.p11_20;

public class Problem13 {
    public static void main(String[] args) {
        Solution13 s = new Solution13();
        System.out.println(s.solution(5));
        System.out.println(s.solution(6));
        System.out.println(s.solution(5000));
    }
}

/**
 * 문제: 멀리 뛰기
*/
class Solution13 {
    public int solution(int n) {
        int answer = 1;

        while (n > 2) {
            if (n % 2 != 0) {
                answer++;
            }

            n /= 2;
        }

        return answer;
    }
}
