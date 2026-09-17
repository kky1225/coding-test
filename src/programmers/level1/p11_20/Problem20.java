package programmers.level1.p11_20;

public class Problem20 {
    public static void main(String[] args) {
        Solution20 s = new Solution20();
        System.out.println(s.solution("01033334444"));
        System.out.println(s.solution("027778888"));
    }
}

/**
 * 문제: 핸드폰 번호 가리기
*/
class Solution20 {
    public String solution(String phone_number) {
        return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
    }
}
