package programmers.level2.p1_10;

import java.util.Arrays;

public class Problem10 {
    public static void main(String[] args) {
        Solution10 s = new Solution10();
        System.out.println(Arrays.toString(s.solution(10, 2)));
        System.out.println(Arrays.toString(s.solution(8, 1)));
        System.out.println(Arrays.toString(s.solution(24, 24)));
    }
}

/**
 * 문제: 카펫
*/
class Solution10 {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int height = 1;
        int width = sum;

        for (int i = 2; i <= sum / 2; i++) {
            if (sum % i == 0) {
                height = sum / i;
                width = i;

                if ((height - 2) * (width - 2) == yellow) {
                    break;
                }
            }
        }

        return new int[] {height, width};
    }
}
