package programmers.level0.p31_40;

public class Problem34 {
    public static void main(String[] args) {
        Solution34 s = new Solution34();
        System.out.println(s.solution("programmers", "p"));
        System.out.println(s.solution("lowercase", "x"));
    }
}

/**
 * 문제: 특정한 문자를 대문자로 바꾸기
 */
class Solution34 {
    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}
