package main.java.conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double fisherman = Double.parseDouble(scanner.nextLine());
        double boatRental = 0;
        double endSum = 0;

        switch (season) {
            case ("Spring"):
                boatRental = 3000;
                break;
            case ("Summer"):
            case ("Autumn"):
                boatRental = 4200;
                break;
            case ("Winter"):
                boatRental = 2600;
                break;
        }
        if (fisherman <= 6) {
            endSum = boatRental * 0.90;
        } else if (fisherman > 7 && fisherman <= 11) {
            endSum = boatRental * 0.85;
        } else {
            endSum = boatRental * 0.75;
        }

        if (fisherman % 2 == 0 && !(season.equals("Autumn"))) {
            endSum = endSum * 0.95;
        }
        double result = budget - endSum;
        if (result >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", result);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", -result);
        }
    }
}
