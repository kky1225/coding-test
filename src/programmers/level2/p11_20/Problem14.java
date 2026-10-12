package programmers.level2.p11_20;

import java.util.Arrays;

public class Problem14 {
    public static void main(String[] args) {
        Solution14 s = new Solution14();
        System.out.println(s.solution(new int[] {2,6,8,14}));
        System.out.println(s.solution(new int[] {1,2,3}));
    }
}

/**
 * 문제: N개의 최소공배수
*/
class Solution14 {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[arr.length - 1];
        while (true) {
            boolean flag = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (answer % arr[i] != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                break;
            }

            answer += arr[arr.length - 1];
        }

        return answer;
    }
}
