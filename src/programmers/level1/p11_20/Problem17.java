package programmers.level1.p11_20;

import java.util.Arrays;

public class Problem17 {
    public static void main(String[] args) {
        Solution17 s = new Solution17();
        System.out.println(s.solution(new String[]{"Jane", "Kim"}));
    }
}

/**
 * 문제: 서울에서 김서방 찾기
*/
class Solution17 {
    public String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}
