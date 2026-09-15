package programmers.level0.p11_20;

public class Problem14 {
    public static void main(String[] args) {
        Solution14 s = new Solution14();
        System.out.println(s.solution("hello", 3));
    }
}

/**
 * 문제: 문자 반복 출력하기
*/
class Solution14 {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            sb.repeat(c + "", 3);
        }

        return sb.toString();
    }
}
