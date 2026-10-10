package programmers.level2.p1_10;

public class Problem8 {
    public static void main(String[] args) {
        Solution8 s = new Solution8();
        System.out.println(s.solution(78));
        System.out.println(s.solution(15));
    }
}

/**
 * 문제: 다음 큰 숫자
*/
class Solution8 {
    public int solution(int n) {
        long originOneCount = Integer.bitCount(n);
        int answer = 0;

        while (true) {
            n += 1;
            if (Integer.bitCount(n) == originOneCount) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}
