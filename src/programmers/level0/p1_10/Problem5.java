package programmers.level0.p1_10;

public class Problem5 {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.println(s.solution(2, 3));
        System.out.println(s.solution(100, 2));
    }
}

/**
 * 문제: 두 수의 차 구하기
*/
class Solution5 {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }
}
