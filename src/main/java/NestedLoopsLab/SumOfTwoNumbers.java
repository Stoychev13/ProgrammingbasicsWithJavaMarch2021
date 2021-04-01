package main.java.NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startIndex = Integer.parseInt(scanner.nextLine());
        int secondIndex = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean magic = false;
        int firstSum = 0;
        int secondSum = 0;

        for (firstSum = startIndex; firstSum <= secondIndex; firstSum++) {
            for (secondSum = startIndex; secondSum <= secondIndex; secondSum++) {
                counter++;

                if (firstSum + secondSum == magicNumber) {
                    magic = true;
                    break;
                }
            }
            if (magic) {
                break;
            }
        }

        if (magic) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, firstSum, secondSum, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
