package programmers.level0.p41_50;

public class Problem47 {
    public static void main(String[] args) {
        Solution47 s = new Solution47();
        System.out.println(s.solution("AbCdEfG", "aBc"));
        System.out.println(s.solution("aaAA", "aaaaa"));
    }
}

/**
 * 문제: 원하는 문자열 찾기
 */
class Solution47 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
