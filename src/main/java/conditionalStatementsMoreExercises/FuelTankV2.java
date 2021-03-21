package main.java.conditionalStatementsMoreExercises;

import java.util.Scanner;

public class FuelTankV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double amountFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double gas = 0.93;
        double gasoline = 2.22;
        double diesel = 2.33;
        double endSum = 0;

        if (fuel.equals("Gas")) {
            if (clubCard.equals("Yes")) {
                gas = gas - 0.08;
            }
            endSum = amountFuel * gas;
        }
        if (fuel.equals("Gasoline")) {
            if (clubCard.equals("Yes")) {
                gasoline = gasoline - 0.18;
            }
            endSum = amountFuel * gasoline;
        }
        if (fuel.equals("Diesel")) {
            if (clubCard.equals("Yes")) {
                diesel = diesel - 0.12;
            }
            endSum = amountFuel * diesel;
        }
        if (amountFuel >= 20 && amountFuel <= 25) {
            endSum = endSum * 0.92;
        } else if (amountFuel > 25) {
            endSum = endSum * 0.90;
        }
        System.out.printf("%.2f lv.", endSum);
    }
}
