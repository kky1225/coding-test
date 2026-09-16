package programmers.level0.p31_40;

public class Problem39 {
    public static void main(String[] args) {
        Solution39 s = new Solution39();
        System.out.println(s.solution(0, "wsdawsdassw"));
    }
}

/**
 * 문제: 수 조작하기 1
 */
class Solution39 {
    public int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w' -> {
                    n += 1;
                }
                case 's' -> {
                    n -= 1;
                }
                case 'd' -> {
                    n += 10;
                }
                case 'a' -> {
                    n -= 10;
                }
            }
        }
        return n;
    }
}
