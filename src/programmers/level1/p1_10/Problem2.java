package programmers.level1.p1_10;

public class Problem2 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution("1234"));
        System.out.println(s.solution("-1234"));
    }
}

/**
 * 문제: 문자열을 정수로 바꾸기
*/
class Solution2 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}
