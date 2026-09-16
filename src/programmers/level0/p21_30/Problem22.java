package programmers.level0.p21_30;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem22 {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        System.out.println(Arrays.toString(s.solution(24)));
        System.out.println(Arrays.toString(s.solution(29)));
    }
}

/**
 * 문제: 약수 구하기
*/
class Solution22 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
