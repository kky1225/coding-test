package programmers.level0.p1_10;

public class Problem2 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(2, 3));
        System.out.println(s.solution(11, 11));
        System.out.println(s.solution(7, 99));
    }
}

/**
 * 문제: 숫자 비교하기
*/
class Solution2 {
    public int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
