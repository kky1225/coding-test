package programmers.level1.p41_50;

import java.util.Arrays;

public class Problem49 {
    public static void main(String[] args) {
        Solution49 s = new Solution49();
        System.out.println(s.solution(new int[]{30, 15}, new int[]{26, 17}));
        System.out.println(s.solution(new int[]{50, 50}, new int[]{100, 241}));
    }
}

/**
 * 문제: [PCCE 기출문제] 9번 / 지폐 접기
*/
class Solution49 {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        Arrays.sort(wallet);
        Arrays.sort(bill);

        while (wallet[0] < bill[0] || wallet[1] < bill[1]) {
            bill[1] /= 2;
            Arrays.sort(bill);
            answer++;
        }
        return answer;
    }
}
