package programmers.level2.p1_10;

public class Problem4 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.solution("3people unFollowed me"));
        System.out.println(s.solution("for the last week"));
    }
}

/**
 * 문제: JadenCase 문자열 만들기
*/
class Solution4 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                isFirst = true;
                sb.append(s.charAt(i));
                continue;
            }

            if (!isFirst) {
                sb.append(Character.toLowerCase(s.charAt(i)));
                continue;
            }

            sb.append(Character.toUpperCase(s.charAt(i)));

            isFirst = false;
        }

        return sb.toString();
    }
}
