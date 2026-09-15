package programmers.level0.p1_10;

public class Problem6 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.solution(10, 5));
        System.out.println(s.solution(7, 2));
    }
}

/**
 * 문제: 몫 구하기
*/
class Solution6 {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }
}
