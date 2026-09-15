package programmers.level0.p1_10;

public class Problem1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(3, 4));
        System.out.println(s.solution(27, 19));
    }
}

/**
 * 문제: 두 수의 곱 구하기
*/
class Solution1 {
    public int solution(int num1, int num2) {
        return num1 * num2;
    }
}
