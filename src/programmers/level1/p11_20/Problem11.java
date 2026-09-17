package programmers.level1.p11_20;

import java.util.Arrays;
import java.util.stream.LongStream;

public class Problem11 {
    public static void main(String[] args) {
        Solution11 s = new Solution11();
        System.out.println(Arrays.toString(s.solution(2, 5)));
        System.out.println(Arrays.toString(s.solution(4, 3)));
        System.out.println(Arrays.toString(s.solution(-4, 2)));
    }
}

/**
 * 문제: x만큼 간격이 있는 n개의 숫자
*/
class Solution11 {
    public long[] solution(int x, int n) {
        return LongStream.rangeClosed(1, n).map(i -> i * x).toArray();
    }
}
