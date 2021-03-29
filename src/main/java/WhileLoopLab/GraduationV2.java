package main.java.WhileLoopLab;

import java.util.Scanner;

public class GraduationV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int years = 1;
        int failCounter = 0;
        double endSum = 0;

        while (years <= 12) {
            double evaluation = Double.parseDouble(scanner.nextLine());

            if (evaluation >= 4.00) {
                endSum += evaluation;
                years++;
            }
            if (evaluation < 4.00) {
                endSum += evaluation;
                failCounter++;
            }
            if (failCounter == 2) {
                System.out.printf("%s has been excluded at %d grade", name, years);
                break;
            }
            if (years == 13) {
                System.out.printf("%s graduated. Average grade: %.2f", name, endSum / 12);
            } else {

            }
        }


    }
}
