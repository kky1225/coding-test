package programmers.level0.p1_10;

public class Problem3 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.solution(3, 2));
        System.out.println(s.solution(10, 5));
    }
}

/**
 * 문제: 나머지 구하기
*/
class Solution3 {
    public int solution(int num1, int num2) {
        return num1 % num2;
    }
}
