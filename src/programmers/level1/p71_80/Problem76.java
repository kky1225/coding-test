package programmers.level1.p71_80;

public class Problem76 {
    public static void main(String[] args) {
        Solution76 s = new Solution76();
        System.out.println(s.solution("here is muzi here is a secret message", new int[][]{{0, 3}, {23, 28}}));
        System.out.println(s.solution("my phone number is 01012345678 and may i have your phone number", new int[][]{{5, 5}, {25, 28}, {34, 40}, {53, 59}}));
    }
}

/**
 * 문제: 중요한 단어를 스포 방지
*/
class Solution76 {
    public int solution(String message, int[][] spoiler_ranges) {
        String[] words = message.split(" ");
        String[] blindWords = message.split(" ");
        int answer = 0;
        for (int[] range : spoiler_ranges) {
            int start = range[0];
            int end = range[1];
            int wordStart = 0;
            int wordEnd = 0;

            for (int i = 0; i < words.length; i++) {
                wordEnd = wordStart + words[i].length() - 1;

                if (wordStart <= end && wordEnd >= start) {
                    blindWords[i] = "";
                }

                wordStart = wordEnd + 2;
            }
        }

        for (int i = 0; i < blindWords.length; i++) {
            if (blindWords[i].isEmpty()) {
                String word = words[i];

                String blindMessage = String.join(" ", blindWords);
                if (!(" " + blindMessage + " ").contains(" " + word + " ")) {
                    answer++;
                }

                blindWords[i] = word;
            }
        }

        return answer;
    }
}
