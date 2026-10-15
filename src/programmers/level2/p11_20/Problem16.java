package programmers.level2.p11_20;

public class Problem16 {
    public static void main(String[] args) {
        Solution16 s = new Solution16();
        System.out.println(s.solution(8, 4, 7));
    }
}

/**
 * 문제: 예상 대진표
*/
class Solution16 {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
        }

        return answer;
    }
}
