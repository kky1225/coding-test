package programmers.level1.p61_70;

public class Problem66 {
    public static void main(String[] args) {
        Solution66 s = new Solution66();
        System.out.println(s.solution(new int[] {700, 800, 1100}, new int[][] {{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}}, 5));
        System.out.println(s.solution(new int[] {730, 855, 700, 720}, new int[][] {{710, 700, 650, 735, 700, 931, 912}, {908, 901, 805, 815, 800, 831, 835}, {705, 701, 702, 705, 710, 710, 711}, {707, 731, 859, 913, 934, 931, 905}}, 1));
    }
}

/**
 * 문제: 유연근무제
*/
class Solution66 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for (int i = 0; i < timelogs.length; i++) {
            int day = startday;
            int allowTime = (schedules[i] / 100) * 60 + (schedules[i] % 100) + 10;
            boolean isLate = false;

            for (int j = 0; j < timelogs[i].length; j++) {
                if (day == 6 || day == 7) {
                    day = nextDay(day);
                    continue;
                }

                isLate = (timelogs[i][j] / 100) * 60 + timelogs[i][j] % 100 > allowTime;

                if (isLate) break;

                day = nextDay(day);
            }

            if (!isLate) {
                answer++;
            }
        }
        return answer;
    }

    private int nextDay(int day) {
        day++;
        if (day > 7) {
            day = 1;
        }

        return day;
    }
}
