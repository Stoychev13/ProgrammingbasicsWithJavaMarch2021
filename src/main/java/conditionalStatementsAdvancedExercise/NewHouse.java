package main.java.conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double pricePerFlower = 0;
        double totalPrice = 0;
        if (flowerType.equals("Roses")) {
            pricePerFlower = 5;
            if (number <= 80) {
                totalPrice = pricePerFlower * number;

            } else {
                totalPrice = pricePerFlower * number * 0.9;
            }

        } else if (flowerType.equals("Dahlias")) {
            pricePerFlower = 3.80;
            if (number <= 90) {
                totalPrice = pricePerFlower * number;
            } else {
                totalPrice = pricePerFlower * number * 0.85;
            }
        } else if (flowerType.equals("Tulips")) {
            pricePerFlower = 2.80;
            if (number <= 80) {
                totalPrice = pricePerFlower * number;
            } else {
                totalPrice = pricePerFlower * number * 0.85;
            }
        } else if (flowerType.equals("Narcissus")) {
            pricePerFlower = 3;
            if (number >= 120) {
                totalPrice = pricePerFlower * number;
            } else {
                totalPrice = pricePerFlower * number * 1.15;
            }
        } else if (flowerType.equals("Gladiolus")) {
            pricePerFlower = 2.50;
            if (number >= 80) {
                totalPrice = pricePerFlower * number;
            } else {
                totalPrice = pricePerFlower * number * 1.2;
            }
        }
        double diff = budget - totalPrice;
        if (diff >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    number, flowerType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(diff));
        }
    }
}



