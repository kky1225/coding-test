package programmers.level1.p1_10;

public class Problem4 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.solution(123));
        System.out.println(s.solution(987));
    }
}

/**
 * 문제: 자릿수 더하기
*/
class Solution4 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
