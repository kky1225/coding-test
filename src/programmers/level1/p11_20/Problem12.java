package programmers.level1.p11_20;

public class Problem12 {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        System.out.println(s.solution("pPoooyY"));
        System.out.println(s.solution("Pyy"));
    }
}

/**
 * 문제: 문자열 내 p와 y의 개수
*/
class Solution12 {
    boolean solution(String s) {
        int p = 0, y = 0;

        for (char c : s.toLowerCase().toCharArray()){
            switch (c) {
                case 'p' -> p++;
                case 'y' -> y++;
            }
        }

        return p == y;
    }
}
