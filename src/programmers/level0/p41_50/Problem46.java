package programmers.level0.p41_50;

import java.util.Arrays;

public class Problem46 {
    public static void main(String[] args) {
        Solution46 s = new Solution46();
        System.out.println(Arrays.toString(s.solution(new String[]{"AAA","BBB","CCC","DDD"})));
        System.out.println(Arrays.toString(s.solution(new String[]{"aBc","AbC"})));
    }
}

/**
 * 문제: 배열에서 문자열 대소문자 변환하기
 */
class Solution46 {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if ((i + 1) % 2 == 0) {
                strArr[i] = strArr[i].toUpperCase();
            } else {
                strArr[i] = strArr[i].toLowerCase();
            }
        }

        return strArr;
    }
}
