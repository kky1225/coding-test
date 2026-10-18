package programmers.level2.p21_30;

public class Problem30 {
    public static void main(String[] args) {
        Solution30 s = new Solution30();
        System.out.println(s.solution(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(s.solution(new int[]{4, 1, 2, 1}, 4));
    }
}

/**
 * 문제: 타겟 넘버
*/
class Solution30 {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int sum, int index) {
        if (index == numbers.length) {
            return sum == target ? 1 : 0;
        }

        return dfs(numbers, target, sum + numbers[index], index + 1) + dfs(numbers, target, sum - numbers[index], index + 1);
    }
}
