package programmers.level1.p11_20;

public class Problem19 {
    public static void main(String[] args) {
        Solution19 s = new Solution19();
        System.out.println(s.solution(6));
        System.out.println(s.solution(16));
        System.out.println(s.solution(626331));
    }
}

/**
 * 문제: 콜라츠 추측
*/
class Solution19 {
    public int solution(int num) {
        long n = num;
        int answer = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            answer++;

            if (answer >= 500) {
                return -1;
            }
        }

        return answer;
    }
}
