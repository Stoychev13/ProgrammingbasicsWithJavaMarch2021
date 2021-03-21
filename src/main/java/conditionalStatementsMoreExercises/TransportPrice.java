package main.java.conditionalStatementsMoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vehicle = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double price = 0;

        if (vehicle < 20) {
            switch (dayOrNight) {
                case ("day"):
                    price = vehicle * 0.79 + 0.70;
                    break;
                case ("night"):
                    price = vehicle * 0.90 + 0.70;
                    break;
            }
        }
        if (vehicle >= 20 && vehicle < 100) {
            switch (dayOrNight) {
                case ("day"):
                case ("night"):
                    price = vehicle * 0.09;
                    break;
            }
        }
        if (vehicle >= 100) {
            switch (dayOrNight) {
                case ("day"):
                case ("night"):
                    price = vehicle * 0.06;
                    break;
            }
        }
        System.out.printf("%.2f", price);
    }
}
