package main.java.conditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double num = Double.parseDouble(scanner.nextLine());
        double endSum = 0;

        switch (city) {
            case ("Sofia"):
                if (num >= 0 && num <= 500) {
                    endSum = num * 0.05;
                    System.out.printf("%.2f", endSum);
                }
                if (num > 500 && num <= 1000) {
                    endSum = num * 0.07;
                    System.out.printf("%.2f", endSum);
                }
                if (num > 1000 && num <= 10000) {
                    endSum = num * 0.08;
                    System.out.printf("%.2f", endSum);
                }
                if (num > 10000) {
                    endSum = num * 0.12;
                    System.out.printf("%.2f", endSum);
                }
                if (num < 0) {
                    System.out.println("error");
                }
                break;
            case ("Varna"):
                if (num >= 0 && num <= 500) {
                    endSum = num * 0.045;
                    System.out.printf("%.2f", endSum);
                }
                if (num > 500 && num <= 1000) {
                    endSum = num * 0.075;
                    System.out.printf("%.2f", endSum);
                }
                if (num > 1000 && num <= 10000) {
                    endSum = num * 0.10;
                    System.out.printf("%.2f", endSum);
                }
                if (num > 10000) {
                    endSum = num * 0.13;
                    System.out.printf("%.2f", endSum);
                }
                if (num < 0) {
                    System.out.println("error");
                }
                break;
            case ("Plovdiv"):
                if (num >= 0 && num <= 500) {
                    endSum = num * 0.055;
                    System.out.printf("%.2f", endSum);
                }
                if (num > 500 && num <= 1000) {
                    endSum = num * 0.08;
                    System.out.printf("%.2f", endSum);
                }
                if (num > 1000 && num <= 10000) {
                    endSum = num * 0.12;
                    System.out.printf("%.2f", endSum);
                }
                if (num > 10000) {
                    endSum = num * 0.145;
                    System.out.printf("%.2f", endSum);
                }
                if (num < 0) {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}
