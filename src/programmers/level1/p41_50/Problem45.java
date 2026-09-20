package programmers.level1.p41_50;

import java.util.*;

public class Problem45 {
    public static void main(String[] args) {
        Solution45 s = new Solution45();
        System.out.println(s.solution(new int[]{3,1,2,3}));
        System.out.println(s.solution(new int[]{3,3,3,2,2,4}));
        System.out.println(s.solution(new int[]{3,3,3,2,2,2}));
    }
}

/**
 * 문제: 폰켓몬
*/
class Solution45 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return Math.min(nums.length / 2, set.size());
    }
}
