package programmers.level2.p11_20;

import java.util.HashSet;
import java.util.Set;

public class Problem15 {
    public static void main(String[] args) {
        Solution15 s = new Solution15();
        System.out.println(s.solution(new int[] {7,9,1,1,4}));
    }
}

/**
 * 문제: 연속 부분 수열 합의 개수
*/
class Solution15 {
    public int solution(int[] elements) {
        Set<Integer> numbers = new HashSet<>();
        int size = 1;

        while (size <= elements.length) {
            sum(elements, size++, numbers);
        }

        return numbers.size();
    }

    private void sum(int[] elements, int size, Set<Integer> numbers) {
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                if (j >= elements.length) {
                    sum += elements[j - elements.length];
                } else {
                    sum += elements[j];
                }
            }
            numbers.add(sum);
        }
    }
}
