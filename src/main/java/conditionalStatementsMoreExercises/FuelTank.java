package main.java.conditionalStatementsMoreExercises;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double amountFuel = Double.parseDouble(scanner.nextLine());


        if (fuel.equals("Diesel")) {
            if (amountFuel >= 25) {
                System.out.println("You have enough diesel.");
            } else if (amountFuel < 25) {
                System.out.println("Fill your tank with diesel!");
            }
        }
        if (fuel.equals("Gasoline")) {
            if (amountFuel >= 25) {
                System.out.println("You have enough gasoline.");
            } else if (amountFuel < 25) {
                System.out.println("Fill your tank with gasoline!");
            }
        }
        if (fuel.equals("Gas")) {
            if (amountFuel >= 25) {
                System.out.println("You have enough gas.");
            } else if (amountFuel < 25) {
                System.out.println("Fill your tank with gas!");
            }
        }
        if (!fuel.equals("Diesel")) {
            if (!fuel.equals("Gasoline")) {
                if (!fuel.equals("Gas")) {
                    System.out.println("Invalid fuel!");
                }
            }
        }

    }
}
