package programmers.level2.p21_30;

import java.util.Arrays;

public class Problem25 {
    public static void main(String[] args) {
        Solution25 s = new Solution25();
        System.out.println(s.solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(s.solution(new String[]{"123","456","789"}));
        System.out.println(s.solution(new String[]{"12","123","1235","567","88"}));
    }
}

/**
 * 문제: 전화번호 목록
*/
class Solution25 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i=0;i<phone_book.length-1;i++) {
            if(phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }
}
