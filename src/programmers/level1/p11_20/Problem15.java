package programmers.level1.p11_20;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem15 {
    public static void main(String[] args) {
        Solution15 s = new Solution15();
        System.out.println(s.solution(new int[] {1,2,3,4,6,7,8,0}));
        System.out.println(s.solution(new int[] {5,8,4,0,6,7,9}));
    }
}

/**
 * 문제: 없는 숫자 더하기
*/
class Solution15 {
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(1, 9).sum() - Arrays.stream(numbers).sum();
    }
}
