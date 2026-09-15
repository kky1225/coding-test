package programmers.level0.p1_10;

public class Problem4 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.solution(40));
        System.out.println(s.solution(23));
    }
}

/**
 * 문제: 나이 출력
*/
class Solution4 {
    public int solution(int age) {
        return 2023 - age;
    }
}
