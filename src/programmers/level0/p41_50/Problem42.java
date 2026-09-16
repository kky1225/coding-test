package programmers.level0.p41_50;

public class Problem42 {
    public static void main(String[] args) {
        Solution42 s = new Solution42();
        System.out.println(s.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(s.solution(new int[]{5, 7, 8, 3}));
    }
}

/**
 * 문제: 원소들의 곱과 합
 */
class Solution42 {
    public int solution(int[] num_list) {
        int multiple = 1;
        int square = 0;
        for (int i : num_list) {
            multiple *= i;
            square += i;
        }

        return multiple > square * square ? 0 : 1;
    }
}
