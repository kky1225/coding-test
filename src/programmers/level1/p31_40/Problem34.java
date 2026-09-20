package programmers.level1.p31_40;

public class Problem34 {
    public static void main(String[] args) {
        Solution34 s = new Solution34();
        System.out.println(s.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(s.solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        System.out.println(s.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }
}

/**
 * 문제: 최소직사각형
*/
class Solution34 {
    public int solution(int[][] sizes) {
        int width = 0, height = 0;
        for (int[] size : sizes) {
            width = Math.max(width, Math.max(size[0], size[1]));
            height = Math.max(height, Math.min(size[0], size[1]));
        }

        return width * height;
    }
}
