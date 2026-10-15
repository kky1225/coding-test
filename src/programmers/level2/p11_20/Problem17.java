package programmers.level2.p11_20;

import java.util.*;

public class Problem17 {
    public static void main(String[] args) {
        Solution17 s = new Solution17();
        System.out.println(Arrays.toString(s.solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(s.solution(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(s.solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"})));
    }
}

/**
 * 문제: 영어 끝말잇기
*/
class Solution17 {
    public int[] solution(int n, String[] words) {
        char prevLastWord;
        Set<String> wordList = new HashSet<>();
        wordList.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            prevLastWord = words[i - 1].charAt(words[i - 1].length() - 1);
            if (prevLastWord != words[i].charAt(0)) {
                return new int[]{i % n + 1, i / n + 1};
            }

            if (wordList.contains(words[i])) {
                return new int[]{i % n + 1, i / n + 1};
            }

            wordList.add(words[i]);
        }

        return new int[] {0, 0};
    }
}
