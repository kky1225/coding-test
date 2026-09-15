package programmers.level0.p11_20;

import java.util.Arrays;

public class Problem13 {
    public static void main(String[] args) {
        Solution13 s = new Solution13();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(s.solution(new int[]{1, 3, 5, 7})));
    }
}

/**
 * 문제: 짝수 홀수 개수
*/
class Solution13 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i : num_list) {
            answer[i % 2]++;
        }

        return answer;
    }
}
