package main.java.conditionalStatementsExercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();
        double endSum = 0;

        if (inputUnit.equals("mm")) {
            switch (outputUnit) {
                case ("m"):
                    endSum = num / 1000;
                    break;
                case ("mm"):
                    endSum = num;
                    break;
                case ("cm"):
                    endSum = num / 10;
                    break;
            }
        }
        if (inputUnit.equals("m")) {
            switch (outputUnit) {
                case ("m"):
                    endSum = num;
                    break;
                case ("mm"):
                    endSum = num * 1000;
                    break;
                case ("cm"):
                    endSum = num * 100;  // 1000 ????
                    break;
            }
        }
        if (inputUnit.equals("cm")) {
            switch (outputUnit) {
                case ("m"):
                    endSum = num / 100;
                    break;
                case ("cm"):
                    endSum = num;
                    break;
                case ("mm"):
                    endSum = num * 10;
            }
        }
        System.out.printf("%.3f", endSum);
    }
}
