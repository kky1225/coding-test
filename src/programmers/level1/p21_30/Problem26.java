package programmers.level1.p21_30;

import java.util.stream.IntStream;

public class Problem26 {
    public static void main(String[] args) {
        Solution26 s = new Solution26();
        System.out.println(s.solution(3, 20, 4));
    }
}

/**
 * 문제: 부족한 금액 계산하기
*/
class Solution26 {
    public long solution(int price, int money, int count) {
        long remain = IntStream.rangeClosed(1, count).mapToLong(i -> (long) price * i).sum() - money;
        return remain > 0 ? remain : 0;
    }
}
