package programmers.level0.p11_20;

import java.util.Arrays;

public class Problem11 {
    public static void main(String[] args) {
        Solution11 s = new Solution11();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(s.solution(new int[]{1, 0, 1, 1, 1, 3, 5})));
    }
}

/**
 * 문제: 배열 뒤집기
*/
class Solution11 {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).boxed().toList().reversed().stream().mapToInt(Integer::intValue).toArray();
    }
}
