package main.java.conditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double young = Double.parseDouble(scanner.nextLine());
        double old = Double.parseDouble(scanner.nextLine());
        String typeRace = scanner.nextLine();

        double juniors = 0;
        double seniors = 0;
        double coast = 0;
        double endSum = 0;

        double all = young + old;

        switch (typeRace) {
            case ("trail"):
                juniors = 5.50;
                seniors = 7;
                break;
            case ("cross-country"):
                juniors = 8;
                seniors = 9.50;
                break;
            case ("downhill"):
                juniors = 12.25;
                seniors = 13.75;
                break;
            case ("road"):
                juniors = 20;
                seniors = 21.50;
                break;
        }
        if (typeRace.equals("cross-country")) {
            endSum = young * juniors + old * seniors;
            if (all >= 50) {
                double discount = endSum * 0.75;
                coast = discount * 0.95;
                System.out.printf("%.2f", coast);
            } else {
                coast = endSum * 0.95;
                System.out.printf("%.2f", coast);
            }
        } else {
            endSum = young * juniors + old * seniors;
            coast = endSum * 0.95;
            System.out.printf("%.2f", coast);
        }


    }
}
