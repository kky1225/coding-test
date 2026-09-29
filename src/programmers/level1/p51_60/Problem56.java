package programmers.level1.p51_60;

public class Problem56 {
    public static void main(String[] args) {
        Solution56 s = new Solution56();
        System.out.println(s.solution("banana"));
        System.out.println(s.solution("abracadabra"));
        System.out.println(s.solution("aaabbaccccabba"));
    }
}

/**
 * 문제: 문자열 나누기
*/
class Solution56 {
    public int solution(String s) {
        int answer = 0;
        int same = 0, diff = 0;
        char ref = 0;

        for (char c : s.toCharArray()) {
            if (same == 0 && diff == 0) ref = c;

            if (ref == c) {
                same++;
            } else {
                diff++;
            }

            if (same == diff) {
                same = 0;
                diff = 0;
                answer++;
            }
        }

        return same != diff ? answer + 1 : answer;
    }
}
