package programmers.level0.p21_30;

public class Problem23 {
    public static void main(String[] args) {
        Solution23 s = new Solution23();
        System.out.println(s.solution("happy birthday!"));
        System.out.println(s.solution("I love you~"));
    }
}

/**
 * 문제: 가장 큰 수 찾기
*/
class Solution23 {
    public int solution(String message) {
        return message.length() * 2;
    }
}
