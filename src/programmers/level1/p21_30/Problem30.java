package programmers.level1.p21_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem30 {
    public static void main(String[] args) {
        Solution30 s = new Solution30();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(s.solution(new int[]{4,4,4,3,3})));
    }
}

/**
 * 문제: 같은 숫자는 싫어
*/
class Solution30 {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        int prev = -1;
        for (int i : arr) {
            if (prev == i) {
                continue;
            }

            list.add(i);
            prev = i;
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
