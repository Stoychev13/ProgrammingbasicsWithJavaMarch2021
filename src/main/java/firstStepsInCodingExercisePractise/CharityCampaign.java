package main.java.firstStepsInCodingExercisePractise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDays = Integer.parseInt(scanner.nextLine());
        int numConfectioners = Integer.parseInt(scanner.nextLine());
        int numCakes = Integer.parseInt(scanner.nextLine());
        int numWaffles = Integer.parseInt(scanner.nextLine());
        int numPancakes = Integer.parseInt(scanner.nextLine());

        double cakes = numCakes * 45;
        double waffles = numWaffles * 5.80;
        double pancakes = numPancakes * 3.20;

        double priceForOneDay = (cakes + waffles + pancakes) * numConfectioners;
        double priceCollectForAllCompany = priceForOneDay * numDays;
        double priceAfterCoveringTheCosts = priceCollectForAllCompany * 0.875;

        System.out.printf("%.2f", priceAfterCoveringTheCosts);

    }
}
