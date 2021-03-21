package main.java.conditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chrysanthemum = Double.parseDouble(scanner.nextLine());
        double rosa = Double.parseDouble(scanner.nextLine());
        double tulips = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrysanthemumPrice = 0;
        double rosaPrice = 0;
        double tulipsPrice = 0;
        double allFlowers = chrysanthemum + rosa + tulips;

        switch (season) {
            case ("Summer"):
            case ("Spring"):
                chrysanthemumPrice = 2.00;
                rosaPrice = 4.10;
                tulipsPrice = 2.50;
                break;
            case ("Autumn"):
            case ("Winter"):
                chrysanthemumPrice = 3.75;
                rosaPrice = 4.50;
                tulipsPrice = 4.15;
                break;
        }
        double endSum = chrysanthemum * chrysanthemumPrice + rosa * rosaPrice + tulips * tulipsPrice;

        if (holiday.equals("Y")) {
            double holidayBonus = endSum * 0.15;
            endSum = endSum + holidayBonus;
        } else if (holiday.equals("N")) {
            endSum = endSum + 0;
        }

        if (season.equals("Spring")) {
            if (tulips >= 7) {
                endSum = endSum * 0.95;
            }
        } else if (season.equals("Winter")) {
            if (rosa >= 10) {
                endSum = endSum * 0.90;
            }
        }
        if (allFlowers >= 20) {
            endSum = endSum * 0.80;
        }
        System.out.printf("%.2f", endSum + 2);

    }
}
