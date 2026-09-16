package programmers.level0.p31_40;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem40 {
    public static void main(String[] args) {
        Solution40 s = new Solution40();
        System.out.println(Arrays.toString(s.solution(3, 10)));
    }
}

/**
 * 문제: 카운트 업
 */
class Solution40 {
    public int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
