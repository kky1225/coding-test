package programmers.level1.p21_30;

import java.util.Arrays;

public class Problem25 {
    public static void main(String[] args) {
        Solution25 s = new Solution25();
        System.out.println(s.solution("Zbcdefg"));
    }
}

/**
 * 문제: 문자열 내림차순으로 배치하기
*/
class Solution25 {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new StringBuilder(new String(c)).reverse().toString();
    }
}
