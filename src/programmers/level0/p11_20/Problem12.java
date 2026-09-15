package programmers.level0.p11_20;

public class Problem12 {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        System.out.println(s.solution("jaron"));
        System.out.println(s.solution("bread"));
    }
}

/**
 * 문제: 뒤집힌 문자열
*/
class Solution12 {
    public String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
}
