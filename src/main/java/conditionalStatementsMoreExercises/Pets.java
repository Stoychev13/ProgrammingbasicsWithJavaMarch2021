package main.java.conditionalStatementsMoreExercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDays = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double foodForDog = Double.parseDouble(scanner.nextLine());
        double foodForCat = Double.parseDouble(scanner.nextLine());
        double foodForTurtles = Double.parseDouble(scanner.nextLine());

        double turtlesFood = foodForTurtles * 0.001;
        double dog = numDays * foodForDog;
        double cat = numDays * foodForCat;
        double turtles = turtlesFood * numDays;

        double allFood = dog + cat + turtles;

        if (foodInKg >= allFood) {
            double end = Math.floor(foodInKg - allFood);
            System.out.printf("%.0f kilos of food left.", end);
        } else {
            double end = Math.ceil(allFood - foodInKg);
            System.out.printf("%.0f more kilos of food are needed.", end);
        }

    }
}
