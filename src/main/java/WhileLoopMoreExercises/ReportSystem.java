package main.java.WhileLoopMoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 0;
        int cash = 0;
        int card = 0;
        int cashPerson = 0;
        int cardPerson = 0;
        int allPrice = 0;

        while (!input.equals("End")) {
            int transaction = Integer.parseInt(input);

            counter++;

            if (counter % 2 == 0) {
                if (transaction < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    cardPerson++;
                    card += transaction;
                    System.out.println("Product sold!");
                    allPrice += transaction;

                }
            }
            if (counter % 2 != 0) {
                if (transaction > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    cashPerson++;
                    cash += transaction;
                    System.out.println("Product sold!");
                    allPrice += transaction;

                }
            }

            if (allPrice >= sum) {
                break;
            }
            input = scanner.nextLine();
        }
        if (allPrice < sum) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            double sumCash = cash * 1.0 / cashPerson;
            double sumCard = card * 1.0 / cardPerson;
            System.out.printf("Average CS: %.2f\n", sumCash);
            System.out.printf("Average CC: %.2f", sumCard);
        }

    }
}
