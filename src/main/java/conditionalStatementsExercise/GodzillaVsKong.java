package main.java.conditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numExtras = Integer.parseInt(scanner.nextLine());
        double priceClothingForOneExtras = Double.parseDouble(scanner.nextLine());

        double priceForClothing = 0;
        double endSumForFilm = 0;
        double priceForDecor = budget * 0.10;

        if (numExtras <= 150) {
            priceForClothing = numExtras * priceClothingForOneExtras;
            endSumForFilm = priceForDecor + priceForClothing;
        } else {
            priceForClothing = numExtras * priceClothingForOneExtras;
            priceForClothing = priceForClothing * 0.90;
            endSumForFilm = priceForDecor + priceForClothing;
        }


        if (budget >= endSumForFilm) {
            double rest = budget - endSumForFilm;
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", rest);
        } else {
            double rest = Math.abs(budget - endSumForFilm);
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", rest);
        }

    }
}
