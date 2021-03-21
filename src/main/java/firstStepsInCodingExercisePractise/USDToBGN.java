package main.java.firstStepsInCodingExercisePractise;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());

        double bgn = 1.79549;
        double convert = usd * bgn;

        System.out.println(convert);
    }
}
