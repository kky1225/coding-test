package programmers.level0.p31_40;

import java.util.Arrays;

public class Problem31 {
    public static void main(String[] args) {
        Solution31 s = new Solution31();
        System.out.println(s.solution(new int[]{149, 180, 192, 170}, 167));
        System.out.println(s.solution(new int[]{180, 120, 140}, 190));
    }
}

/**
 * 문제: 머쓱이보다 키 큰 사람
 */
class Solution31 {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}
