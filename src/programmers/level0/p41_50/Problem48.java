package programmers.level0.p41_50;

public class Problem48 {
    public static void main(String[] args) {
        Solution48 s = new Solution48();
        System.out.println(s.solution("ProgrammerS123", 11));
        System.out.println(s.solution("He110W0r1d", 5));
    }
}

/**
 * 문제: 문자열의 뒤의 n글자
 */
class Solution48 {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}
