package main.java.firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class WeatherForecastV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weather = Double.parseDouble(scanner.nextLine());

        if (weather >= 5.00 && weather <= 11.9) {
            System.out.println("Cold");
        } else if (weather >= 12 && weather <= 14.9) {
            System.out.println("Cool");
        } else if (weather >= 15 && weather <= 20) {
            System.out.println("Mild");
        } else if (weather >= 20.1 && weather <= 25.9) {
            System.out.println("Warm");
        } else if (weather >= 26 && weather <= 35) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}
