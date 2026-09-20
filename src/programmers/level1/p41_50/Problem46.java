package programmers.level1.p41_50;

public class Problem46 {
    public static void main(String[] args) {
        Solution46 s = new Solution46();
        System.out.println(s.solution(5, 3, 2));
        System.out.println(s.solution(10, 3, 2));
    }
}

/**
 * 문제: 기사단원의 무기
*/
class Solution46 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count += j * j == i ? 1 : 2;
                }
            }

            answer += count > limit ? power : count;
        }
        return answer;
    }
}
