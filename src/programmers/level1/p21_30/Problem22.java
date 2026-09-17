package programmers.level1.p21_30;

public class Problem22 {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        System.out.println(s.solution("abcde"));
        System.out.println(s.solution("qwer"));
    }
}

/**
 * 문제: 가운데 글자 가져오기
*/
class Solution22 {
    public String solution(String s) {
        if (s.length() % 2 == 0) {
            return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }

        return s.substring(s.length() / 2, s.length() / 2 + 1);
    }
}
