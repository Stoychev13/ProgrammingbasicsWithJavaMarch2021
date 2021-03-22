package main.java.conditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num = scanner.nextFloat();
        double sum = 0;

        while (true) {
            if (num < 0) {
                System.out.println("Negative number!");
                break;
            }
            sum = num * 2;
            System.out.printf("Result: %.2f", sum);
            System.out.println();
            num = scanner.nextFloat();
        }
    }
}
