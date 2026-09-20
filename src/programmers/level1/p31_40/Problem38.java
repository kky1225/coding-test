package programmers.level1.p31_40;

public class Problem38 {
    public static void main(String[] args) {
        Solution38 s = new Solution38();
        System.out.println(s.solution("one4seveneight"));
        System.out.println(s.solution("23four5six7"));
        System.out.println(s.solution("2three45sixseven"));
        System.out.println(s.solution("123"));
    }
}

/**
 * 문제: 숫자 문자열과 영단어
*/
class Solution38 {
    public int solution(String s) {
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");

        return Integer.parseInt(s);
    }
}
