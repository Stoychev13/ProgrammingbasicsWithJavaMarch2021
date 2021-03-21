package main.java.conditionalStatementsMoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double water = p1 * hours + p2 * hours;

        if (water <= v) {
            double percentV = (water / v * 100);
            double percentP1 = (p1 * hours / water * 100);
            double percentP2 = (p2 * hours / water * 100);
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentV, percentP1, percentP2);
        } else {
            System.out.printf("For %f hours the pool overflows with %f liters.", hours, water - v);
        }
    }
}
