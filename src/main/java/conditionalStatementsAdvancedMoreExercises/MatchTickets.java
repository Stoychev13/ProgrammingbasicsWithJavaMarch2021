package main.java.conditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String typeTicket = scanner.nextLine();
        int numPeople = Integer.parseInt(scanner.nextLine());

        double endTicketBudget = 0;
        double ticket = 0;

        if (numPeople <= 4) {
            endTicketBudget = budget * 0.25;
        } else if (numPeople <= 9) {
            endTicketBudget = budget * 0.40;
        } else if (numPeople <= 24) {
            endTicketBudget = budget * 0.50;
        } else if (numPeople <= 49) {
            endTicketBudget = budget * 0.60;
        } else if (numPeople > 50) {
            endTicketBudget = budget * 0.75;
        }

        switch (typeTicket) {
            case "VIP":
                ticket = 499.99;
                break;

            case "Normal":
                ticket = 249.99;
                break;
        }

        double endSum = ticket * numPeople;

        if (endSum <= endTicketBudget) {
            double itCoast = endTicketBudget - endSum;
            System.out.printf("Yes! You have %.2f leva left.", itCoast);
        } else {
            double itCoast = Math.abs(endSum - endTicketBudget);
            System.out.printf("Not enough money! You need %.2f leva.", itCoast);
        }
    }
}
