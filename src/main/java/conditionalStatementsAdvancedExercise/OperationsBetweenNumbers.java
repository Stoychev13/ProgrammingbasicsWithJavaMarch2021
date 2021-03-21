package main.java.conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();

        double endSum = 0;

        if (symbol.equals("+")) {
            endSum = num1 + num2;
            if (endSum % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", num1, symbol, num2, endSum);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", num1, symbol, num2, endSum);
            }
        }
        if (symbol.equals("-")) {
            endSum = num1 - num2;
            if (endSum % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", num1, symbol, num2, endSum);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", num1, symbol, num2, endSum);
            }
        }
        if (symbol.equals("*")) {
            endSum = num1 * num2;
            if (endSum % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", num1, symbol, num2, endSum);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", num1, symbol, num2, endSum);
            }
        }
        if (symbol.equals("/")) {
            endSum = num1 / num2;
            if (num2 != 0) {
                System.out.printf("%.0f %s %.0f = %.2f", num1, symbol, num2, endSum);
            } else {
                System.out.printf("Cannot divide %.0f by zero", num1);
            }
        }
        if (symbol.equals("%")) {
            endSum = num1 % num2;
            if (num2 != 0) {
                System.out.printf("%.0f %s %.0f = %.0f ", num1, symbol, num2, endSum);
            } else {
                System.out.printf("Cannot divide %.0f by zero", num1);
            }
        }
    }
}
