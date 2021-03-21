package main.java.firstStepsInCodingExercisePractise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        int termOfDeposit = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        double percent = annualInterestRate * 0.01;
        double calculateAccruedInterest = sum * percent;
        double oneMonthInterestRate = calculateAccruedInterest / 12;
        double endSum = sum + ((termOfDeposit) * oneMonthInterestRate);

        System.out.println(endSum);
    }
}
