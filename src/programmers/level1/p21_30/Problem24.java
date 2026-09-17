package programmers.level1.p21_30;

public class Problem24 {
    public static void main(String[] args) {
        Solution24 s = new Solution24();
        System.out.println(s.solution(13, 17));
        System.out.println(s.solution(24, 27));
    }
}

/**
 * 문제: 약수의 개수와 덧셈
*/
class Solution24 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            answer = count % 2 == 0 ? answer + i : answer - i;
        }
        return answer;
    }
}
