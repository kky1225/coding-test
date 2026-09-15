package programmers.level0.p11_20;

import java.util.stream.IntStream;

public class Problem17 {
    public static void main(String[] args) {
        Solution17 s = new Solution17();
        System.out.println(s.solution(10));
        System.out.println(s.solution(4));
    }
}

/**
 * 문제: 짝수의 합
*/
class Solution17 {
    public int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).sum();
    }
}
