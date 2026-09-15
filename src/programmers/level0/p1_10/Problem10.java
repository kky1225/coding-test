package programmers.level0.p1_10;

import java.util.Arrays;

public class Problem10 {
    public static void main(String[] args) {
        Solution10 s = new Solution10();
        System.out.println(Arrays.toString(s.solution(5500)));
        System.out.println(Arrays.toString(s.solution(15000)));
    }
}

/**
 * 문제: 아이스 아메리카노
*/
class Solution10 {
    public int[] solution(int money) {
        return new int[] {money / 5500, money % 5500};
    }
}
