package programmers.level1.p71_80;

public class Problem73 {
    public static void main(String[] args) {
        Solution73 s = new Solution73();
        System.out.println(s.solution(22, 6, 8));
        System.out.println(s.solution(13, 3, 6));
    }
}

/**
 * 문제: 택배 상자 꺼내기
*/
class Solution73 {
    public int solution(int n, int w, int num) {
        int h = n / w;
        if (n % w > 0) {
            h++;
        }
        int[][] box =  new int[h][w];

        int boxNum = 1;
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    box[i][j] = boxNum > n ? 0 : boxNum++;
                }
            } else {
                for (int j = w - 1; j >= 0; j--) {
                    box[i][j] = boxNum > n ? 0 : boxNum++;
                }
            }
        }

        int height = (num - 1) / w;
        int width;
        if (height % 2 == 0) {
            width = (num - 1) % w;
        } else {
            width = w - 1 - (num - 1) % w;
        }

        int answer = 0;
        for (int i = height; i < h; i++) {
            if (box[i][width] != 0) {
                answer++;
            }
        }

        return answer;
    }
}
