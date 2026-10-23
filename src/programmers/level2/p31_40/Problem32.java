package programmers.level2.p31_40;

public class Problem32 {
    public static void main(String[] args) {
        Solution32 s = new Solution32();
        System.out.println(s.solution("AAAAE"));
        System.out.println(s.solution("AAAE"));
        System.out.println(s.solution("I"));
        System.out.println(s.solution("EIO"));
    }
}

/**
 * 문제: 타겟 넘버
*/
class Solution32 {
    public int solution(String word) {
        int answer = 1;
        StringBuilder sb = new StringBuilder("A");
        while (!sb.toString().equals(word)) {
            if (sb.length() < 5) {
                sb.append("A");
            } else {
                dictionary(sb);
            }
            answer++;
        }

        return answer;
    }

    private void dictionary(StringBuilder sb) {
        int lastIndex = sb.length() - 1;
        char lastChar = sb.charAt(lastIndex);
        switch (lastChar) {
            case 'A' -> {
                sb.deleteCharAt(lastIndex);
                sb.append("E");
            }
            case 'E' -> {
                sb.deleteCharAt(lastIndex);
                sb.append("I");
            }
            case 'I' -> {
                sb.deleteCharAt(lastIndex);
                sb.append("O");
            }
            case 'O' -> {
                sb.deleteCharAt(lastIndex);
                sb.append("U");
            }
            case 'U' -> {
                sb.deleteCharAt(lastIndex);
                dictionary(sb);
            }
        }
    }
}
