package main.java.conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double weekendInSofia = 48 - h;
        double sundayGames = weekendInSofia * (3.0 / 4.0);
        double holidays = p * (2.0 / 3.0);
        double allGames = 0;

        switch (year) {
            case ("normal"):
                allGames = Math.floor(sundayGames + holidays + h);
                System.out.printf("%.0f", allGames);
                break;
            case ("leap"):
                allGames = sundayGames + holidays + h;
                double endDays = allGames * 0.15;
                endDays = Math.floor(allGames + endDays);
                System.out.printf("%.0f", endDays);
                break;
        }

    }
}
