package programmers.level1.p51_60;

import java.util.List;

public class Problem54 {
    public static void main(String[] args) {
        Solution54 s = new Solution54();
        System.out.println(s.solution("aukks", "wbqd", 5));
    }
}

/**
 * 문제: 둘만의 암호
*/
class Solution54 {
    public String solution(String s, String skip, int index) {
        List<Character> skipList = skip.chars().mapToObj(c -> (char) c).toList();
        StringBuilder sb = new StringBuilder();

        for (char word : s.toCharArray()) {
            for (int i = 0; i < index; i++) {
                word = word == 'z' ? 'a' : (char) (word + 1);

                if (skipList.contains(word)) {
                    i--;
                }
            }

            sb.append(word);
        }

        return sb.toString();
    }
}
