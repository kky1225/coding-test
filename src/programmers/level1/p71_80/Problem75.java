package programmers.level1.p71_80;

import java.util.Arrays;

public class Problem75 {
    public static void main(String[] args) {
        Solution75 s = new Solution75();
        System.out.println(s.solution(new int[][]{{2, 1, 2}, {5, 1, 1}}));
        System.out.println(s.solution(new int[][]{{2, 3, 2}, {3, 1, 3}, {2, 1, 1}}));
        System.out.println(s.solution(new int[][]{{3, 3, 3}, {5, 4, 2}, {2, 1, 2}}));
        System.out.println(s.solution(new int[][]{{1, 1, 4}, {2, 1, 3}, {3, 1, 2}, {4, 1, 1}}));

    }
}

/**
 * 문제: 노란불 신호등
*/
class Solution75 {
    public int solution(int[][] signals) {
        int maxSecond = 1;
        for (int[] signal : signals) {
            int sum = Arrays.stream(signal).sum();
            maxSecond = maxSecond * sum / gcd(maxSecond, sum);
        }

        for (int i = 1; i <= maxSecond; i++) {
            boolean isSame = true;
            for (int[] signal : signals) {
                int green = signal[0], yellow = signal[1], red = signal[2];
                int now = i % (green + yellow + red);

                if (now <= green || now > green + yellow) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                return i;
            }
        }

        return -1;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
