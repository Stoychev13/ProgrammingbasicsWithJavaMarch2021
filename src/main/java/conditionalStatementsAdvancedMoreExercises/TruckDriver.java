package main.java.conditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmForMonth = Double.parseDouble(scanner.nextLine());
        double priceForOil = 0;

        if (kmForMonth <= 5000) {
            switch (season) {
                case ("Spring"):
                case ("Autumn"):
                    priceForOil = kmForMonth * 0.75;
                    priceForOil = priceForOil * 4;
                    priceForOil = priceForOil * 0.90;
                    break;
                case ("Winter"):
                    priceForOil = kmForMonth * 1.05;
                    priceForOil = priceForOil * 4;
                    priceForOil = priceForOil * 0.90;
                    break;
                case ("Summer"):
                    priceForOil = kmForMonth * 0.90;
                    priceForOil = priceForOil * 4;
                    priceForOil = priceForOil * 0.90;
                    break;
            }
        } else if (kmForMonth <= 10000) {
            switch (season) {
                case ("Spring"):
                case ("Autumn"):
                    priceForOil = kmForMonth * 0.95;
                    priceForOil = priceForOil * 4;
                    priceForOil = priceForOil * 0.90;
                    break;
                case ("Summer"):
                    priceForOil = kmForMonth * 1.10;
                    priceForOil = priceForOil * 4;
                    priceForOil = priceForOil * 0.90;
                    break;
                case ("Winter"):
                    priceForOil = kmForMonth * 1.25;
                    priceForOil = priceForOil * 4;
                    priceForOil = priceForOil * 0.90;
                    break;
            }
        } else if (kmForMonth <= 20000) {
            switch (season) {
                case ("Spring"):
                case ("Autumn"):
                case ("Summer"):
                case ("Winter"):
                    priceForOil = kmForMonth * 1.45;
                    priceForOil = priceForOil * 4;
                    priceForOil = priceForOil * 0.90;
                    break;
            }
        }
        System.out.printf("%.2f", priceForOil);
    }
}
