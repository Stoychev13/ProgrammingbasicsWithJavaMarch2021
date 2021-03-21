package main.java.conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int overnight = Integer.parseInt(scanner.nextLine());

        double studio = 0;
        double apartment = 0;
        double priceForStudio = 0;
        double priceForAp = 0;

        switch (month) {
            case ("May"):
            case ("October"):
                studio = 50;
                apartment = 65;
                if (overnight > 7 && overnight <= 14) {
                    studio = studio * 0.95;
                } else if (overnight > 14) {
                    studio = studio * 0.70;
                    apartment = apartment * 0.90;
                }
                priceForStudio = studio * overnight;
                priceForAp = apartment * overnight;
                break;
            case ("June"):
            case ("September"):
                studio = 75.20;
                apartment = 68.70;
                if (overnight > 14) {
                    studio = studio * 0.80;
                    apartment = apartment * 0.90;
                }
                priceForStudio = studio * overnight;
                priceForAp = apartment * overnight;
                break;
            case ("July"):
            case ("August"):
                studio = 76;
                apartment = 77;
                if (overnight > 14) {
                    apartment = apartment * 0.90;
                }
                priceForAp = apartment * overnight;
                priceForStudio = studio * overnight;
                break;
        }
        System.out.printf("Apartment: %.2f lv.", priceForAp);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", priceForStudio);
    }
}
