package programmers.level1.p31_40;

public class Problem37 {
    public static void main(String[] args) {
        Solution37 s = new Solution37();
        System.out.println(s.solution(new int[]{1, 3, 4, 6}));
        System.out.println(s.solution(new int[]{1, 7, 1, 2}));
    }
}

/**
 * 문제: 푸드 파이트 대회
*/
class Solution37 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < food.length; i++) {
            sb.repeat(String.valueOf(i), food[i] / 2);
        }

        String origin = sb.toString();
        return origin + "0" + sb.reverse();
    }
}
