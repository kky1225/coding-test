package programmers.level2.p31_40;

public class Problem35 {
    public static void main(String[] args) {
        Solution35 s = new Solution35();
        System.out.println(s.solution(2, 4, 2, 1));
        System.out.println(s.solution(16, 16, 2, 1));
        System.out.println(s.solution(16, 16, 2, 2));
    }
}

/**
 * 문제: [3차] n진수 게임
*/
class Solution35 {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        int order = 1;
        int next = p;
        while (sb.length() < t) {
            String str = Integer.toString(num, n).toUpperCase();
            for (int i = 0; i < str.length(); i++) {
                if (order == next) {
                    sb.append(str.charAt(i));
                    if (sb.length() >= t) {
                        return sb.toString();
                    }
                    next += m;
                }

                order++;
            }

            num++;
        }

        return sb.toString();
    }
}
