package main.java.fIrstStepsInCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDogs = Integer.parseInt(scanner.nextLine());
        int numAnimals = Integer.parseInt(scanner.nextLine());

        double priceForDogsFood = numDogs * 2.50;
        double priceForAnimalsFood = numAnimals * 4;
        double endPrice = priceForAnimalsFood + priceForDogsFood;

        System.out.printf("%.1f lv.", endPrice);
    }
}
