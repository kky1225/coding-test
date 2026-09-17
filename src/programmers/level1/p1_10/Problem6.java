package programmers.level1.p1_10;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.solution(118372));
    }
}

/**
 * 문제: 정수 내림차순으로 배치하기
*/
class Solution6 {
    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        return Long.parseLong(new StringBuilder(new String(chars)).reverse().toString());
    }
}
