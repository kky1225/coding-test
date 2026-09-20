package programmers.level1.p21_30;

public class Problem27 {
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        System.out.println(s.solution("a234"));
        System.out.println(s.solution("1234"));
    }
}

/**
 * 문제: 문자열 다루기 기본
*/
class Solution27 {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        return s.chars().allMatch(Character::isDigit);
    }
}
