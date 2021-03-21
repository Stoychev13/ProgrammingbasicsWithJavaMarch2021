package main.java.conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double endSum = 0;
        String destination = "";
        String room = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case ("summer"):
                    room = "Camp";
                    endSum = budget * 0.30;
                    System.out.printf("Somewhere in %s\n%s - %.2f", destination, room, endSum);
                    break;
                case ("winter"):
                    room = "Hotel";
                    endSum = budget * 0.70;
                    System.out.printf("Somewhere in %s\n%s - %.2f", destination, room, endSum);
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case ("summer"):
                    room = "Camp";
                    endSum = budget * 0.40;
                    System.out.printf("Somewhere in %s\n%s - %.2f", destination, room, endSum);
                    break;
                case ("winter"):
                    room = "Hotel";
                    endSum = budget * 0.80;
                    System.out.printf("Somewhere in %s\n%s - %.2f", destination, room, endSum);
                    break;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            switch (season) {
                case ("summer"):
                case ("winter"):
                    room = "Hotel";
                    endSum = budget * 0.90;
                    System.out.printf("Somewhere in %s\n%s - %.2f", destination, room, endSum);
                    break;
            }
        }
    }
}
