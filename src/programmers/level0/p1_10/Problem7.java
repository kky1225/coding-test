package programmers.level0.p1_10;

public class Problem7 {
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        System.out.println(s.solution(2, 3));
        System.out.println(s.solution(100, 2));
    }
}

/**
 * 문제: 두 수의 합 구하기
*/
class Solution7 {
    public int solution(int num1, int num2) {
        return num1 + num2;
    }
}
