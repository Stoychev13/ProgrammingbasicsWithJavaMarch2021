package main.java.conditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass = "";
        String car = "";
        double sum = 0;

        if (budget <= 100) {
            carClass = "Economy class";
            switch (season) {
                case ("Summer"):
                    car = "Cabrio";
                    sum = budget * 0.35;
                    break;
                case ("Winter"):
                    car = "Jeep";
                    sum = budget * 0.65;
                    break;
            }
        } else if (budget <= 500) {
            carClass = "Compact class";
            switch (season) {
                case ("Summer"):
                    car = "Cabrio";
                    sum = budget * 0.45;
                    break;
                case ("Winter"):
                    car = "Jeep";
                    sum = budget * 0.80;
                    break;
            }
        } else if (budget > 500) {
            carClass = "Luxury class";
            switch (season) {
                case ("Summer"):
                case ("Winter"):
                    car = "Jeep";
                    sum = budget * 0.90;
            }
        }
        System.out.printf("%s\n%s - %.2f", carClass, car, sum);
    }
}
