package main.java.firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForKgVegetables = Double.parseDouble(scanner.nextLine());
        double priceForKgFruits = Double.parseDouble(scanner.nextLine());
        int allKgVegetables = Integer.parseInt(scanner.nextLine());
        int allKgFruits = Integer.parseInt(scanner.nextLine());

        double vegetablesPrice = priceForKgVegetables * allKgVegetables;
        double fruitsPrice = priceForKgFruits * allKgFruits;
        double endPrice = vegetablesPrice + fruitsPrice;
        endPrice = endPrice / 1.94;

        System.out.printf("%.2f", endPrice);
    }
}
