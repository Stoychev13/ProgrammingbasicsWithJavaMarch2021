package main.java.firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelOfKg = Double.parseDouble(scanner.nextLine());
        double spratsOfKg = Double.parseDouble(scanner.nextLine());
        double bonitoOfKg = Double.parseDouble(scanner.nextLine());
        double horseMackerelOfKg = Double.parseDouble(scanner.nextLine());
        double musselsOgKg = Double.parseDouble(scanner.nextLine());

        double priceForMackerel = mackerelOfKg + mackerelOfKg * 0.60;
        double sumMackerel = bonitoOfKg * priceForMackerel;
        double priceForSprats = spratsOfKg + spratsOfKg * 0.80;
        double sumSprats = horseMackerelOfKg * priceForSprats;
        double sumMussels = musselsOgKg * 7.50;
        double endSum = sumMackerel + sumMussels + sumSprats;

        System.out.printf("%.2f", endSum);
    }
}
