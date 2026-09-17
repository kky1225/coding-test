package programmers.level1.p1_10;

public class Problem7 {
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        System.out.println(s.solution(121));
        System.out.println(s.solution(3));
    }
}

/**
 * 문제: 정수 제곱근 판별
*/
class Solution7 {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);

        if (sqrt * sqrt != n) {
            return -1;
        }

        sqrt = sqrt + 1;

        return sqrt * sqrt;
    }
}
