package programmers.level1.p61_70;

import java.util.Arrays;

public class Problem69 {
    public static void main(String[] args) {
        Solution69 s = new Solution69();
        System.out.println(s.solution(new int[]{5,3,2}, new String[][]{{"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}}));
    }
}

/**
 * 문제: 공원 산책
*/
class Solution69 {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);

        for (int m = mats.length - 1; m >= 0; m--) {
            int size = mats[m];

            for (int i = 0; i + size <= park.length; i++) {
                for (int j = 0; j + size <= park[i].length; j++) {
                    if (isAvailable(park, i, j, size)) {
                        return size;
                    }
                }
            }
        }

        return -1;
    }

    private boolean isAvailable(String[][] park, int i, int j, int size) {
        for (int k = i; k < i + size; k++) {
            for (int l = j; l < j + size; l++) {
                if (!"-1".equals(park[k][l])) {
                    return false;
                }
            }
        }

        return true;
    }
}
