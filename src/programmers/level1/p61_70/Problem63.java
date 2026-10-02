package programmers.level1.p61_70;

public class Problem63 {
    public static void main(String[] args) {
        Solution63 s = new Solution63();
        System.out.println(s.solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println(s.solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println(s.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }
}

/**
 * 문제: 키패드 누르기
*/
class Solution63 {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[] left = {3, 0};
        int[] right = {3, 2};

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                left[0] = number / 3;
                left[1] = 0;
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                right[0] = number / 3 - 1;
                right[1] = 2;
            } else {
                int[] index = {number == 0 ? 3 : number / 3, 1};
                int lDistance = Math.abs(index[0] - left[0]) + Math.abs(index[1] - left[1]);
                int rDistance = Math.abs(index[0] - right[0]) + Math.abs(index[1] - right[1]);

                if (lDistance == rDistance) {
                    switch (hand) {
                        case "right" -> {
                            sb.append("R");
                            right[0] = index[0];
                            right[1] = index[1];
                        }
                        case "left" -> {
                            sb.append("L");
                            left[0] = index[0];
                            left[1] = index[1];
                        }
                    }
                } else if (rDistance > lDistance) {
                    sb.append("L");
                    left[0] = index[0];
                    left[1] = index[1];
                } else {
                    sb.append("R");
                    right[0] = index[0];
                    right[1] = index[1];
                }
            }
        }

        return sb.toString();
    }
}
