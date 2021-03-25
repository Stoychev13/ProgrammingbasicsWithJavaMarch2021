package main.java.ForLoopExercise;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;

        double evenSum = 0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                oddSum += num;
            }
            if (i % 2 == 0 && num > oddMax) {
                oddMax = num;
            }
            if (i % 2 == 0 && num < oddMin) {
                oddMin = num;
            }

            if (i % 2 != 0) {
                evenSum += num;
            }
            if (i % 2 != 0 && num > evenMax) {
                evenMax = num;
            }
            if (i % 2 != 0 && num < evenMin) {
                evenMin = num;
            }
        }

        if (n == 0) {
            System.out.printf("OddSum=%.2f,\nOddMin=No,\nOddMax=No,\n", oddSum);
            System.out.printf("EvenSum=%.2f,\nEvenMin=No,\nEvenMax=No", evenSum);
        } else if ((evenMax == -1000000000.0) || (evenMin == 1000000000.0)) {
            System.out.printf("OddSum=%.2f,\nOddMin=%.2f,\nOddMax=%.2f,\n", oddSum, oddMin, oddMax);
            System.out.printf("EvenSum=%.2f,\nEvenMin=No,\nEvenMax=No", evenSum);
        } else {
            System.out.printf("OddSum=%.2f,\nOddMin=%.2f,\nOddMax=%.2f,\n", oddSum, oddMin, oddMax);
            System.out.printf("EvenSum=%.2f,\nEvenMin=%.2f,\nEvenMax=%.2f", evenSum, evenMin, evenMax);
        }
    }
}
