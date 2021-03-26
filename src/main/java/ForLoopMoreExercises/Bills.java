package main.java.ForLoopMoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double water = 20;
        double internet = 15;
        double electricity = 0;
        double priceForAllMonths = 0;
        double counterMonths = 0;
        double priceFOrOneMonth = 0;
        double result = 0;

        for (int i = 0; i < months; i++) {
            double priceForElectricity = Double.parseDouble(scanner.nextLine());

            electricity += priceForElectricity;
            counterMonths++;

            priceFOrOneMonth = priceForElectricity + water + internet;
            priceForAllMonths = priceFOrOneMonth * 0.20;
            priceFOrOneMonth = priceFOrOneMonth + priceForAllMonths;

            result += priceFOrOneMonth;

        }
        water = water * counterMonths;
        internet = internet * counterMonths;


        System.out.printf("Electricity: %.2f lv\n", electricity);
        System.out.printf("Water: %.2f lv\n", water);
        System.out.printf("Internet: %.2f lv\n", internet);
        System.out.printf("Other: %.2f lv\n", result);
        System.out.printf("Average: %.2f lv\n", (electricity + water + internet + result) / counterMonths);
    }
}
