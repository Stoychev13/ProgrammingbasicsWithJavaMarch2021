package main.java.conditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String accommodation = "";
        String city = "";

        double sum = 0;

        if (budget <= 1000) {
            accommodation = "Camp";
            switch (season) {
                case "Summer":
                    city = "Alaska";
                    sum = budget * 0.65;
                    break;
                case ("Winter"):
                    city = "Morocco";
                    sum = budget * 0.45;
                    break;
            }
        } else if (budget <= 3000) {
            accommodation = "Hut";
            switch (season) {
                case ("Summer"):
                    city = "Alaska";
                    sum = budget * 0.80;
                    break;
                case ("Winter"):
                    city = "Morocco";
                    sum = budget * 0.60;
                    break;
            }
        } else if (budget > 3000) {
            accommodation = "Hotel";
            switch (season) {
                case ("Winter"):
                    city = "Morocco";
                    sum = budget * 0.90;
                    break;
                case ("Summer"):
                    city = "Alaska";
                    sum = budget * 0.90;
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f", city, accommodation, sum);
    }
}
