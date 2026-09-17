package programmers.level1.p1_10;

public class Problem10 {
    public static void main(String[] args) {
        Solution10 s = new Solution10();
        System.out.println(s.solution(10));
        System.out.println(s.solution(12));
        System.out.println(s.solution(11));
        System.out.println(s.solution(13));
    }
}

/**
 * 문제: 하샤드 수
*/
class Solution10 {
    public boolean solution(int x) {
        return x % String.valueOf(x).chars().map(i -> i - '0').sum() == 0;
    }
}
