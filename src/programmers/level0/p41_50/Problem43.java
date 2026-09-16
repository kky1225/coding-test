package programmers.level0.p41_50;

public class Problem43 {
    public static void main(String[] args) {
        Solution43 s = new Solution43();
        System.out.println(s.solution("masterpiece"));
        System.out.println(s.solution("programmers"));
        System.out.println(s.solution("jerry"));
        System.out.println(s.solution("burn"));
    }
}

/**
 * 문제: rny_string
 */
class Solution43 {
    public String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
}
