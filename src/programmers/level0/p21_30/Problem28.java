package programmers.level0.p21_30;

public class Problem28 {
    public static void main(String[] args) {
        Solution28 s = new Solution28();
        System.out.println(s.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(s.solution("ppprrrogrammers", "pppp"));
        System.out.println(s.solution("AbcAbcA", "AAA"));
    }
}

/**
 * 문제: 문자열안에 문자열
 */
class Solution28 {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
