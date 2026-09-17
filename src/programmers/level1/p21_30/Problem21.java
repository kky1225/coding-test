package programmers.level1.p21_30;

public class Problem21 {
    public static void main(String[] args) {
        Solution21 s = new Solution21();
        System.out.println(s.solution(new int[]{1, 2, 3, 4}, new int[]{-3,-1,0,2}));
        System.out.println(s.solution(new int[]{-1,0,1}, new int[]{1,0,-1}));
    }
}

/**
 * 문제: 내적
*/
class Solution21 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
