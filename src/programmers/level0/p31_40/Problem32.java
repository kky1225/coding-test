package programmers.level0.p31_40;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem32 {
    public static void main(String[] args) {
        Solution32 s = new Solution32();
        System.out.println(Arrays.toString(s.solution(10)));
        System.out.println(Arrays.toString(s.solution(15)));
    }
}

/**
 * 문제: 짝수는 싫어요
 */
class Solution32 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).toArray();
    }
}
