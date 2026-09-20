package programmers.level1.p31_40;

public class Problem31 {
    public static void main(String[] args) {
        Solution31 s = new Solution31();
        System.out.println(s.solution("3141592", "271"));
        System.out.println(s.solution("500220839878", "7"));
        System.out.println(s.solution("10203", "15"));
    }
}

/**
 * 문제: 크기가 작은 부분 문자열
*/
class Solution31 {
    public int solution(String t, String p) {
        int answer = 0;
        long target = Long.parseLong(p);
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String number = t.substring(i, i + p.length());
            if (Long.parseLong(number) <= target) {
                answer++;
            }
        }
        return answer;
    }
}
