package main.java.WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stopCommand = scanner.nextLine();
        double endSum = 0;
        double increase = 0;

        while (!stopCommand.equals("NoMoreMoney")) {
            double num = Double.parseDouble(stopCommand);

            if (num < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            increase = num;
            endSum += num;
            System.out.printf("Increase: %.2f\n", increase);
            stopCommand = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", endSum);

    }
}
