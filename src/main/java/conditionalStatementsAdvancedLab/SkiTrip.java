package main.java.conditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        double overnight = days - 1;
        double endPrice = 0;

        if (typeRoom.equals("room for one person")) {
            if (days <= 10) {
                endPrice = 18 * overnight;
            } else if (days <= 15) {
                endPrice = 18 * overnight;
            } else {
                endPrice = 18 * overnight;
            }
        }
        if (typeRoom.equals("apartment")) {
            if (days <= 10) {
                endPrice = 25 * overnight;
                endPrice = endPrice * 0.70;
            } else if (days <= 15) {
                endPrice = 25 * overnight;
                endPrice = endPrice * 0.65;
            } else {
                endPrice = 25 * overnight;
                endPrice = endPrice * 0.50;
            }
        }
        if (typeRoom.equals("president apartment")) {
            if (days <= 10) {
                endPrice = overnight * 35;
                endPrice = endPrice * 0.90;
            } else if (days <= 15) {
                endPrice = overnight * 35;
                endPrice = endPrice * 0.85;
            } else {
                endPrice = overnight * 35;
                endPrice = endPrice * 0.80;
            }
        }
        if (rating.equals("positive")) {
            double rate = 0;
            rate = endPrice * 0.25;
            endPrice = endPrice + rate;
        }
        if (rating.equals("negative")) {
            endPrice = endPrice * 0.90;
        }
        System.out.printf("%.2f", endPrice);

    }
}
