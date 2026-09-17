package programmers.level1.p21_30;

public class Problem23 {
    public static void main(String[] args) {
        Solution23 s = new Solution23();
        System.out.println(s.solution(3));
        System.out.println(s.solution(4));
    }
}

/**
 * 문제: 수박수박수박수박수박수?
*/
class Solution23 {
    public String solution(int n) {
        return "수박".repeat(n / 2 + 1).substring(0, n);
    }
}
