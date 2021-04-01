package main.java.NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String destination = scanner.nextLine();

            if (destination.equals("End")) {
                break;
            }

            double budget = Double.parseDouble(scanner.nextLine());
            double needSum = 0;

            while (budget > needSum) {
                double sum = Double.parseDouble(scanner.nextLine());
                needSum += sum;
            }
            System.out.printf("Going to %s!\n", destination);

        }
    }
}
