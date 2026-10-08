package programmers.level2.p1_10;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.println(Arrays.toString(s.solution("110010101001")));
        System.out.println(Arrays.toString(s.solution("01110")));
        System.out.println(Arrays.toString(s.solution("1111111")));
    }
}

/**
 * 문제: 이진 변환 반복하기
*/
class Solution5 {
    public int[] solution(String s) {
        String str = s;
        int[] answer = new int[2];
        while (!"1".equals(str)) {
            String remove = str.replace("0", "");
            answer[1] += str.length() - remove.length();
            str = Integer.toBinaryString(remove.length());
            answer[0]++;
        }

        return answer;
    }
}
