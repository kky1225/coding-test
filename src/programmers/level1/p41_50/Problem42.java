package programmers.level1.p41_50;

public class Problem42 {
    public static void main(String[] args) {
        Solution42 s = new Solution42();
        System.out.println(s.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(s.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}

/**
 * 문제: 카드 뭉치
*/
class Solution42 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Index = 0;
        int card2Index = 0;
        for (String s : goal) {
            if (card1Index < cards1.length && cards1[card1Index].equals(s)) {
                card1Index++;
            } else if (card2Index < cards2.length && cards2[card2Index].equals(s)) {
                card2Index++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
