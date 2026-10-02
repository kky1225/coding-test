package programmers.level1.p61_70;

import java.util.Arrays;

public class Problem64 {
    public static void main(String[] args) {
        Solution64 s = new Solution64();
        System.out.println(Arrays.toString(s.solution(new String[]{".#...", "..#..", "...#."})));
        System.out.println(Arrays.toString(s.solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."})));
        System.out.println(Arrays.toString(s.solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."})));
        System.out.println(Arrays.toString(s.solution(new String[]{"..", "#."})));
    }
}

/**
 * 문제: 바탕화면 정리
*/
class Solution64 {
    public int[] solution(String[] wallpaper) {
        int[] min = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] max = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int i = 0; i < wallpaper.length; i++) {
            int firstX = wallpaper[i].indexOf('#');
            if (firstX == -1) {
                continue;
            }

            int lastX = wallpaper[i].lastIndexOf('#');
            min[0] = Math.min(min[0], i);
            min[1] = Math.min(min[1], firstX);
            max[0] = Math.max(max[0], i + 1);
            max[1] = Math.max(max[1], lastX + 1);
        }

        return new int[] {min[0], min[1], max[0], max[1]};
    }
}
