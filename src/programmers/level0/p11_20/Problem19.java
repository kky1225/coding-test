package programmers.level0.p11_20;

public class Problem19 {
    public static void main(String[] args) {
        Solution19 s = new Solution19();
        System.out.println(s.solution(new int[] {2, 4}));
        System.out.println(s.solution(new int[] {-7, 9}));
    }
}

/**
 * 문제: 점의 위치 구하기
*/
class Solution19 {
    public int solution(int[] dot) {
        return dot[0] > 0 && dot[1] > 0 ? 1 : dot[0] < 0 && dot[1] > 0 ? 2 : dot[0] < 0 && dot[1] < 0 ? 3 : 4;
    }
}
