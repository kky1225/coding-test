package programmers.level1.p11_20;

import java.util.Arrays;

public class Problem16 {
    public static void main(String[] args) {
        Solution16 s = new Solution16();
        System.out.println(Arrays.toString(s.solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(s.solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(s.solution(new int[]{3, 2, 6}, 10)));
    }
}

/**
 * 문제: 나누어 떨어지는 숫자 배열
*/
class Solution16 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        if (answer.length == 0) {
            return new int[] {-1};
        }

        return answer;
    }
}
