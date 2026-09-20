package programmers.level1.p31_40;

public class Problem33 {
    public static void main(String[] args) {
        Solution33 s = new Solution33();
        System.out.println(s.solution("try hello world"));
    }
}

/**
 * 문제: 이상한 문자 만들기
*/
class Solution33 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(" ");
                index = 0;
            } else {
                sb.append(index % 2 == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c));
                index++;
            }
        }

        return sb.toString();
    }
}
