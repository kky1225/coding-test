package programmers.level2.p31_40;

import java.util.HashSet;
import java.util.Set;

public class Problem31 {
    public static void main(String[] args) {
        Solution31 s = new Solution31();
        System.out.println(s.solution("ULURRDLLU"));
        System.out.println(s.solution("LULLLLLLU"));
    }
}

/**
 * 문제: 타겟 넘버
*/
class Solution31 {
    public int solution(String dirs) {
        Set<Place> set = new HashSet<>();
        int prevX = 0, prevY = 0;

        for (char c : dirs.toCharArray()) {
            int nextX = prevX, nextY = prevY;

            if (c == 'U') {
                nextY = prevY + 1;
            } else if  (c == 'D') {
                nextY = prevY - 1;
            } else if (c == 'L') {
                nextX = prevX - 1;
            } else if (c == 'R') {
                nextX = prevX + 1;
            }

            if (nextX < 6 && nextX > -6 && nextY < 6 && nextY > -6) {
                set.add(new Place(prevX, prevY, nextX, nextY));
                set.add(new Place(nextX, nextY, prevX, prevY));

                prevX = nextX;
                prevY = nextY;
            }
        }

        return set.size() / 2;
    }

    record Place(int prevX, int prevY, int nextX, int nextY) {

    }
}
