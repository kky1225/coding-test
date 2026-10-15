package programmers.level2.p11_20;

import java.util.*;

public class Problem18 {
    public static void main(String[] args) {
        Solution18 s = new Solution18();
        System.out.println(s.solution(new String[] {"banana", "apple", "rice", "pork", "pot"}, new int[] {3, 2, 2, 2, 1}, new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
        System.out.println(s.solution(new String[] {"apple"}, new int[] {10}, new String[] {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}));
    }
}

/**
 * 문제: 할인 행사
*/
class Solution18 {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> index = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            index.put(want[i], i);
        }

        int answer = 0;
        int idx = 0;
        while (idx + 10 <= discount.length) {
            int[] counts = Arrays.copyOf(number, number.length);

            for (int i = idx; i < idx + 10; i++) {
                if (index.containsKey(discount[i])) {
                    counts[index.get(discount[i])] -= 1;
                }
            }

            if (isAllDiscount(counts)) answer++;

            idx++;
        }


        return answer;
    }

    private boolean isAllDiscount(int[] counts) {
        for (int count : counts) {
            if (count > 0) {
                return false;
            }
        }

        return true;
    }
}
