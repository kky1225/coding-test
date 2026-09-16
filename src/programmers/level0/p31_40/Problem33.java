package programmers.level0.p31_40;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem33 {
    public static void main(String[] args) {
        Solution33 s = new Solution33();
        System.out.println(s.solution(new String[]{"a","b","c"}));
    }
}

/**
 * 문제: 문자 리스트를 문자열로 변환하기
 */
class Solution33 {
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}
