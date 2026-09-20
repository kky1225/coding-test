package programmers.level1.p31_40;

public class Problem40 {
    public static void main(String[] args) {
        Solution40 s = new Solution40();
        System.out.println(s.solution(2, 1, 20));
        System.out.println(s.solution(3, 1 ,20));
    }
}

/**
 * 문제: 콜라 문제
*/
class Solution40 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int exchange = (n / a) * b;
            n = exchange + (n % a);
            answer += exchange;
        }
        return answer;
    }
}
