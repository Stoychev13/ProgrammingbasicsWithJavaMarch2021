package main.java.conditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double recordInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecForSwimmingOneMeter = Double.parseDouble(scanner.nextLine());

        double swimming = recordInMeters * timeInSecForSwimmingOneMeter;
        double bonusSec = Math.floor(recordInMeters / 15) * 12.5;
        double endSec = swimming + bonusSec;

        if (endSec >= recordInSec) {
            endSec = endSec - recordInSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.", endSec);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", endSec);
        }
    }
}
