package main.java.ForLoopMoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gameInputs = Integer.parseInt(scanner.nextLine());
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;
        double n6 = 0;
        double value = 0;
        double result = 0;

        for (int i = 1; i <= gameInputs; i++) {
            double numbers = Double.parseDouble(scanner.nextLine());

            if (numbers >= 0 && numbers <= 9) {
                n1++;
                value = numbers * 0.20;
                result += value;
            } else if (numbers >= 10 && numbers <= 19) {
                n2++;
                value = numbers * 0.30;
                result += value;
            } else if (numbers >= 20 && numbers <= 29) {
                n3++;
                value = numbers * 0.40;
                result += value;
            } else if (numbers >= 30 && numbers <= 39) {
                value = 50;
                result += value;
                n4++;
            } else if (numbers >= 40 && numbers <= 50) {
                value = 100;
                result += value;
                n5++;
            } else {
                result /= 2;
                n6++;
            }


        }

        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", n1 / gameInputs * 100);
        System.out.printf("From 10 to 19: %.2f%%\n", n2 / gameInputs * 100);
        System.out.printf("From 20 to 29: %.2f%%\n", n3 / gameInputs * 100);
        System.out.printf("From 30 to 39: %.2f%%\n", n4 / gameInputs * 100);
        System.out.printf("From 40 to 50: %.2f%%\n", n5 / gameInputs * 100);
        System.out.printf("Invalid numbers: %.2f%%\n", n6 / gameInputs * 100);


    }
}
