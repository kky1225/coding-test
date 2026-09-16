package programmers.level0.p31_40;

import java.util.stream.IntStream;

public class Problem37 {
    public static void main(String[] args) {
        Solution37 s = new Solution37();
        System.out.println(s.solution(7));
        System.out.println(s.solution(10));
    }
}

/**
 * 문제: 홀짝에 따라 다른 값 반환하기
 */
class Solution37 {
    public int solution(int n) {
        if (n % 2 == 0) {
            return IntStream.iterate(2, i -> i <= n, i -> i + 2).map(i -> i * i).sum();
        }

        return IntStream.iterate(1, i -> i <= n, i -> i + 2).sum();
    }
}
