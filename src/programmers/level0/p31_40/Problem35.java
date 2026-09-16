package programmers.level0.p31_40;

public class Problem35 {
    public static void main(String[] args) {
        Solution35 s = new Solution35();
        System.out.println(s.solution("string", 3));
        System.out.println(s.solution("love", 10));
    }
}

/**
 * 문제: 문자열 곱하기
 */
class Solution35 {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
