package main.java.conditionalStatementsMoreExercises;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hours = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());
        int numWorkers = Integer.parseInt(scanner.nextLine());

        double percent = days * 0.90;
        double hoursForWork = percent * 8;
        double overtimeWork = numWorkers * (2 * days);
        double endTime = Math.floor(hoursForWork + overtimeWork);

        if (endTime >= hours) {
            double timeLeft = endTime - hours;
            System.out.printf("Yes!%.0f hours left.", timeLeft);
        } else {
            double timeLeft = Math.abs(hours - endTime);
            System.out.printf("Not enough time!%.0f hours needed.", timeLeft);
        }
    }
}
