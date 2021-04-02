package main.java.NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNotPrime = 0;


        while (!input.equalsIgnoreCase("Stop")) {
            int number = Integer.parseInt(input);
            int counter = 0;
            if (number < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        counter++;

                    }

                }
                if (counter == 2) {
                    sumPrime += number;
                } else {
                    sumNotPrime += number;
                }

            }


            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNotPrime);
    }
}
