package programmers.level1.p51_60;

public class Problem52 {
    public static void main(String[] args) {
        Solution52 s = new Solution52();
        System.out.println(s.solution(10));
        System.out.println(s.solution(5));
    }
}

/**
 * 문제: 소수 찾기
*/
class Solution52 {
    public int solution(int n) {
        boolean[] remove = new boolean[n + 1];
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (remove[i]) {
                continue;
            }

            answer++;
            for (long j = (long) i * i; j <= n; j += i) {
                remove[(int) j] = true;
            }
        }

        return answer;
    }
}
