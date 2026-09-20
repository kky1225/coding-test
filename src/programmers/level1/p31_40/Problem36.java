package programmers.level1.p31_40;

public class Problem36 {
    public static void main(String[] args) {
        Solution36 s = new Solution36();
        System.out.println(s.solution("AB", 1));
        System.out.println(s.solution("z", 1));
        System.out.println(s.solution("a B z", 4));
    }
}

/**
 * 문제: 시저 암호
*/
class Solution36 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append((char) ((c - 'A' + n) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                sb.append((char) ((c - 'a' + n) % 26 + 'a'));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
