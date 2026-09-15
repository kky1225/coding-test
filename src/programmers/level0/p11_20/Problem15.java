package programmers.level0.p11_20;

public class Problem15 {
    public static void main(String[] args) {
        Solution15 s = new Solution15();
        System.out.println(s.solution(70));
        System.out.println(s.solution(91));
        System.out.println(s.solution(180));
    }
}

/**
 * 문제: 각도기
*/
class Solution15 {
    public int solution(int angle) {
        return angle < 90 ? 1 : angle == 90 ? 2 : angle < 180 ? 3 : 4;
    }
}
