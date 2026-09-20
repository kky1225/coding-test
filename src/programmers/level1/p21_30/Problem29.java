package programmers.level1.p21_30;

import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            System.out.println("*".repeat(a));
        }
    }
}

/**
 * 문제: 직사각형 별찍기
*/
