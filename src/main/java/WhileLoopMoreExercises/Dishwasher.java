package main.java.WhileLoopMoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBottle = Integer.parseInt(scanner.nextLine());
        int sumPreparation = numBottle * 750;
        String input = scanner.nextLine();

        int endSum = 0;
        int plates = 0;
        int pot = 0;
        int platesCounter = 0;
        int potCounter = 0;
        int counter = 1;


        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);

            if (counter % 3 == 0) {
                pot = dishes * 15;
                endSum += pot;
                potCounter += dishes;
            } else {
                plates = dishes * 5;
                endSum += plates;
                platesCounter += dishes;
            }

            if (endSum > sumPreparation) {
                endSum = Math.abs(endSum - sumPreparation);
                System.out.printf("Not enough detergent, %d ml. more necessary!", endSum);
                break;
            }

            counter++;
            input = scanner.nextLine();
        }
        if (input.equals("End")) {
            sumPreparation = sumPreparation - endSum;
            System.out.printf("Detergent was enough!\n%d dishes and %d pots were washed.\nLeftover detergent %d ml.", platesCounter, potCounter, sumPreparation);

        }


    }
}
