package main.java.conditionalStatementsMoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double z = Double.parseDouble(scanner.nextLine());
        int numWorkers = Integer.parseInt(scanner.nextLine());

        double allGrape = x * y;
        double wine = allGrape * 0.40 / 2.5;

        if (wine >= z) {
            double litersWine = Math.ceil(wine - z);
            double litersForWorkers = Math.ceil(litersWine / numWorkers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n%.0f liters left -> %.0f liters per person.", Math.floor(wine), litersWine, litersForWorkers);
        } else {
            double litersLeft = Math.floor(z - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", litersLeft);
        }
    }
}
