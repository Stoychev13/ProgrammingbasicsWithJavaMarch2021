package main.java.ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int endSum = 0;
        int endSumTwo = 0;

        for (int i = 0; i < n; i++) {
            endSum += Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n; i++) {
            endSumTwo += Integer.parseInt(scanner.nextLine());
        }
        if (endSum == endSumTwo) {
            System.out.printf("Yes, sum = %d", endSum);
        } else {
            int diff = Math.abs(endSumTwo - endSum);
            System.out.printf("No, diff = %d", diff);
        }

    }
}
