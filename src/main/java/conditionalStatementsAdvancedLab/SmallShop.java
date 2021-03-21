package main.java.conditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String city = scanner.nextLine();
        double numDrinks = Double.parseDouble(scanner.nextLine());
        double endSum = 0;

        if (city.equals("Sofia")) {
            switch (drink) {
                case ("coffee"):
                    endSum = numDrinks * 0.50;
                    break;
                case ("water"):
                    endSum = numDrinks * 0.80;
                    break;
                case ("beer"):
                    endSum = numDrinks * 1.20;
                    break;
                case ("sweets"):
                    endSum = numDrinks * 1.45;
                    break;
                case ("peanuts"):
                    endSum = numDrinks * 1.60;
                    break;
            }
        }
        if (city.equals("Plovdiv")) {
            switch (drink) {
                case ("coffee"):
                    endSum = numDrinks * 0.40;
                    break;
                case ("water"):
                    endSum = numDrinks * 0.70;
                    break;
                case ("beer"):
                    endSum = numDrinks * 1.15;
                    break;
                case ("sweets"):
                    endSum = numDrinks * 1.30;
                    break;
                case ("peanuts"):
                    endSum = numDrinks * 1.50;
                    break;
            }
        }
        if (city.equals("Varna")) {
            switch (drink) {
                case ("coffee"):
                    endSum = numDrinks * 0.45;
                    break;
                case ("water"):
                    endSum = numDrinks * 0.70;
                    break;
                case ("beer"):
                    endSum = numDrinks * 1.10;
                    break;
                case ("sweets"):
                    endSum = numDrinks * 1.35;
                    break;
                case ("peanuts"):
                    endSum = numDrinks * 1.55;
                    break;
            }
        }
        System.out.println(endSum);

    }
}
