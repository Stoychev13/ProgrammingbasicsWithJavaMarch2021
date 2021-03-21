package main.java.firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit = Double.parseDouble(scanner.nextLine());
        double celsius = 0;

        celsius = (fahrenheit * 1.8) + 32;
        System.out.printf("%.2f", celsius);

    }
}
