package main.java.conditionalStatementsMoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int holidays = days * 127;
        int workdays = 365 - days;
        workdays = workdays * 63;
        int allMin = holidays + workdays;

        if (30000 > allMin) {
            double m = 30000 - allMin;
            double hours = Math.floor(m / 60);
            double min = m % 60;

            System.out.printf("Tom sleeps well\n%.0f hours and %.0f minutes less for play", hours, min);
        } else {
            double m = allMin - 30000;
            double hours = Math.floor(m / 60);
            double min = m % 60;
            System.out.printf("Tom will run away\n%.0f hours and %.0f minutes more for play", hours, min);

        }
    }
}
