package main.java.conditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double num = Double.parseDouble(scanner.nextLine());
        double endSum = 0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            switch (fruit) {
                case ("banana"):
                    endSum = 2.50 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("apple"):
                    endSum = 1.20 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("orange"):
                    endSum = 0.85 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("grapefruit"):
                    endSum = 1.45 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("kiwi"):
                    endSum = 2.70 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("pineapple"):
                    endSum = 5.50 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("grapes"):
                    endSum = 3.85 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case ("banana"):
                    endSum = 2.70 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("apple"):
                    endSum = 1.25 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("orange"):
                    endSum = 0.90 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("grapefruit"):
                    endSum = 1.60 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("kiwi"):
                    endSum = 3.00 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("pineapple"):
                    endSum = 5.60 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                case ("grapes"):
                    endSum = 4.20 * num;
                    System.out.printf("%.2f", endSum);
                    break;
                default:
                    System.out.println("error");
            }
        }else {
            System.out.println("error");
        }
    }
}
