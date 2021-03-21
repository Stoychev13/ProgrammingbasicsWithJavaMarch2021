package main.java.conditionalStatementsExercise;

import java.util.Scanner;

public class TimePlus15Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int min = m + 15;
        int totalHour = hour;
        if (min >= 60) {
            totalHour = totalHour + 1;
            min = min % 60;
        }
        String minFormat = "";
        if (min < 10) {
            minFormat = "0" + min;
        } else {
            minFormat = "" + min;
        }

        if (totalHour >= 24) {
            totalHour = totalHour - 24;
        }

        System.out.printf("%d:%s",totalHour,minFormat);
    }
}
