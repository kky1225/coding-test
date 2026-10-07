package programmers.level1.p61_70;

public class Problem70 {
    public static void main(String[] args) {
        Solution70 s = new Solution70();
        System.out.println(s.solution(new int[]{5, 1, 5}, 30, new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}}));
        System.out.println(s.solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));
        System.out.println(s.solution(new int[]{4, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));
        System.out.println(s.solution(new int[]{1, 1, 1}, 5, new int[][]{{1, 2}, {3, 2}}));
    }
}

/**
 * 문제: [PCCP 기출문제] 1번 / 붕대 감기
*/
class Solution70 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int lastSecond = attacks[attacks.length - 1][0];
        int nowHealth = health;
        boolean isAttacked = false;
        int second = bandage[0];

        for (int i = 0; i <= lastSecond; i++) {
            for (int[] attack : attacks) {
                if (i == attack[0]) {
                    nowHealth -= attack[1];
                    isAttacked = true;
                    second = bandage[0];
                    break;
                }
            }

            if (nowHealth <= 0) {
                return -1;
            }

            if (!isAttacked) {
                if (nowHealth >= health) {
                    continue;
                }

                second--;
                nowHealth = Math.min(nowHealth + bandage[1], health);

                if (second <= 0) {
                    nowHealth = Math.min(nowHealth + bandage[2], health);
                    second = bandage[0];
                }
            }

            isAttacked = false;
        }

        return nowHealth;
    }
}
