package programmers.level1.p61_70;

import java.util.List;

public class Problem65 {
    public static void main(String[] args) {
        Solution65 s = new Solution65();
        System.out.println(s.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(s.solution("z-+.^."));
        System.out.println(s.solution( "=.="));
        System.out.println(s.solution( "123_.def"));
        System.out.println(s.solution( "abcdefghijklmn.p"));
    }
}

/**
 * 문제: 신규 아이디 추천
*/
class Solution65 {
    public String solution(String new_id) {
        List<Character> allow = List.of('-', '_');
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }

            if (Character.isLetterOrDigit(c) || allow.contains(c)) {
                sb.append(c);
            } else if (c == '.') {
                if (sb.lastIndexOf(".") == sb.length() - 1) {
                    continue;
                }

                if (sb.isEmpty()) {
                    continue;
                }

                sb.append(c);
            }
        }

        if (sb.isEmpty()) {
            sb.append("a");
        }

        if (sb.length() > 15) {
            sb.setLength(15);
        }

        while (sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }

        if (sb.length() <= 2) {
            sb.repeat(sb.charAt(sb.length() - 1), 3 - sb.length());
        }

        return sb.toString();
    }
}
