package programmers.level1.p51_60;

public class Problem53 {
    public static void main(String[] args) {
        Solution53 s = new Solution53();
        System.out.println(s.solution(new int[]{1, 2, 3, 4}));
        System.out.println(s.solution(new int[]{1, 2, 7, 6, 4}));
    }
}

/**
 * 문제: 소수 만들기
*/
class Solution53 {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int number) {
        int cnt = 0;
        for (int l = 2; l <= number; l++) {
            if (number % l == 0) {
                cnt++;
            }

            if (cnt > 1) {
                return false;
            }
        }

        return true;
    }
}
