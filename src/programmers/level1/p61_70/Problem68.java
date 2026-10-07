package programmers.level1.p61_70;

import java.util.Arrays;

public class Problem68 {
    public static void main(String[] args) {
        Solution68 s = new Solution68();
        System.out.println(Arrays.toString(s.solution(new String[]{"SOO","OOO","OOO"}, new String[]{"E 2","S 2","W 1"})));
        System.out.println(Arrays.toString(s.solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"})));
        System.out.println(Arrays.toString(s.solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"})));
    }
}

/**
 * 문제: 공원 산책
*/
class Solution68 {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if ('S' == park[i].charAt(j)) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }

        for (String route : routes) {
            int originY = answer[0];
            int originX = answer[1];
            String[] routeParts = route.split(" ");
            int move = Integer.parseInt(routeParts[1]);

            for (int i = 0; i < move; i++) {
                if ("N".equals(routeParts[0])) {
                    if (answer[0] == 0 || park[answer[0] - 1].charAt(answer[1]) == 'X') {
                        answer[0] = originY;
                        answer[1] = originX;
                        break;
                    }

                    answer[0] -= 1;
                } else if ("S".equals(routeParts[0])) {
                    if (answer[0] >= park.length - 1 || park[answer[0] + 1].charAt(answer[1]) == 'X') {
                        answer[0] = originY;
                        answer[1] = originX;
                        break;
                    }

                    answer[0] += 1;
                } else if ("W".equals(routeParts[0])) {
                    if (answer[1] == 0 || park[answer[0]].charAt(answer[1] - 1) == 'X') {
                        answer[0] = originY;
                        answer[1] = originX;
                        break;
                    }

                    answer[1] -= 1;
                } else if ("E".equals(routeParts[0])) {
                    if (answer[1] >= park[answer[0]].length() - 1 || park[answer[0]].charAt(answer[1] + 1) == 'X') {
                        answer[0] = originY;
                        answer[1] = originX;
                        break;
                    }

                    answer[1] += 1;
                }
            }
        }

        return answer;
    }
}
