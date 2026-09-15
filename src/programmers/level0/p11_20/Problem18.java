package programmers.level0.p11_20;

import java.util.stream.IntStream;

public class Problem18 {
    public static void main(String[] args) {
        Solution18 s = new Solution18();
        System.out.println(s.solution(20));
        System.out.println(s.solution(100));
    }
}

/**
 * 문제: 순서쌍의 개수
*/
class Solution18 {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
