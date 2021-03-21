package main.java.firstStepsInCodingExercisePractise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeOfTheAquarium = length * weight * height;
        double allLitersInToAquarium = volumeOfTheAquarium * 0.001;
        double numToPercent = percent * 0.01;
        double endSum = allLitersInToAquarium * (1-numToPercent);
        System.out.printf("%.2f", endSum);
    }
}
