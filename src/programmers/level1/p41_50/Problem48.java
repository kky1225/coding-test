package programmers.level1.p41_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem48 {
    public static void main(String[] args) {
        Solution48 s = new Solution48();
        System.out.println(s.solution(8, 4, new int[]{2, 3, 6}));
        System.out.println(s.solution(5, 4, new int[]{1, 3}));
        System.out.println(s.solution(4, 1, new int[]{1, 2, 3, 4}));
    }
}

/**
 * 문제: 덧칠하기
*/
class Solution48 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastIndex = 0;

        for (int j : section) {
            if (j > lastIndex) {
                answer++;
                lastIndex = j + m - 1;
            }
        }

        return answer;
    }
}
