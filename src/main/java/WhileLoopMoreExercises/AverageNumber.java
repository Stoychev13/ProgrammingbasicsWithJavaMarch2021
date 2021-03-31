package main.java.WhileLoopMoreExercises;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double endSum = 0;
        double counter = 0;


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            endSum += num;
            counter++;
        }
        System.out.printf("%.2f", endSum / counter);

    }
}
