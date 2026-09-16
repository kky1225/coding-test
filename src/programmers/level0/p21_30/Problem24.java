package programmers.level0.p21_30;

import java.util.Arrays;
import java.util.List;

public class Problem24 {
    public static void main(String[] args) {
        Solution24 s = new Solution24();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 8, 3})));
        System.out.println(Arrays.toString(s.solution(new int[]{9, 10, 11, 8})));
    }
}

/**
 * 문제: 가장 큰 수 찾기
 */
class Solution24 {
    public int[] solution(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().toList();
        int max = list.stream().max(Integer::compareTo).orElse(0);
        return new int[] {max, list.indexOf(max)};
    }
}
