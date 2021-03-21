package main.java.firstStepsInCodingExercisePractise;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForStrawberry = Double.parseDouble(scanner.nextLine());
        double kgOfBananas = Double.parseDouble(scanner.nextLine());
        double kgOfOranges = Double.parseDouble(scanner.nextLine());
        double kgOfRaspberry = Double.parseDouble(scanner.nextLine());
        double kgOfStrawberry = Double.parseDouble(scanner.nextLine());

        double priceRaspberryForKg = priceForStrawberry / 2;

        double priceForOranges = priceRaspberryForKg - (0.4 * priceRaspberryForKg);
        double priceForBananas = priceRaspberryForKg - (0.8 * priceRaspberryForKg);
        double sumForRaspberry = kgOfRaspberry * priceRaspberryForKg;
        double sumOranges = kgOfOranges * priceForOranges;
        double sumBananas = kgOfBananas * priceForBananas;
        double sumStrawberry = kgOfStrawberry * priceForStrawberry;
        double endSum = sumForRaspberry + sumOranges + sumBananas + sumStrawberry;

        System.out.printf("%.2f", endSum);
    }
}
