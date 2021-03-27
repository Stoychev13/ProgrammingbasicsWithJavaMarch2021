package main.java.ForLoopMoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int diff = 0;
        int lastSum = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int firstSum = Integer.parseInt(scanner.nextLine());
            int secondSum = Integer.parseInt(scanner.nextLine());

            sum = firstSum + secondSum;

            if (i > 0) {
                diff = Math.abs(lastSum - sum);
            }
            lastSum = sum;
        }
        if (diff == 0) {
            System.out.printf("Yes, value=%s", lastSum);
        } else {
            System.out.printf("No, maxdiff=%s", diff);
        }

    }
}
