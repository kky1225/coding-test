package programmers.level0.p21_30;

import java.util.Arrays;

public class Problem21 {
    public static void main(String[] args) {
        Solution21 s = new Solution21();
        System.out.println(s.solution(new int[] {1, 2, 3}));
        System.out.println(s.solution(new int[] {3, 6, 2}));
        System.out.println(s.solution(new int[] {199, 72, 222}));
    }
}

/**
 * 문제: 삼각형의 완성조건 (1)
*/
class Solution21 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}
