package main.java.NestedLoopsExercise;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < number; i++) {
            for (int j = 1; j < number; j++) {
                for (int k = 'a'; k < 'a' + secondNumber; k++) {
                    for (int l = 'a'; l < 'a' + secondNumber; l++) {
                        for (int m = 2; m <= number; m++) {
                            if (m > i && m > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, l, m);
                            }
                        }
                    }
                }
            }
        }

    }
}
