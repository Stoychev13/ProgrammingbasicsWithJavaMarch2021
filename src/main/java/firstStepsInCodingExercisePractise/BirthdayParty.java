package main.java.firstStepsInCodingExercisePractise;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentForRoom = Double.parseDouble(scanner.nextLine());

        double priceForCake = rentForRoom * 0.20;
        double priceForDrinks = priceForCake * 0.55;
        double priceForAnimator = rentForRoom / 3;
        double endSum = rentForRoom + priceForCake + priceForDrinks + priceForAnimator;

        System.out.println(endSum);


    }
}
