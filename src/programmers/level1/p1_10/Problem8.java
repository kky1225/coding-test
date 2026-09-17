package programmers.level1.p1_10;

public class Problem8 {
    public static void main(String[] args) {
        Solution8 s = new Solution8();
        System.out.println(s.solution(3));
        System.out.println(s.solution(4));
    }
}

/**
 * 문제: 짝수와 홀수
*/
class Solution8 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
