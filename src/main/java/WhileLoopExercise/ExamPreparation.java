package main.java.WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedThereHold = Integer.parseInt(scanner.nextLine());

        int failedCounter = 0;
        int problemCounter = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (failedCounter < failedThereHold) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                isFailed = false;
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                failedCounter++;
            }

            gradesSum += grade;
            problemCounter++;
            lastProblem = problemName;
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", failedThereHold);
        } else {
            System.out.printf("Average score: %.2f\n", gradesSum / problemCounter);
            System.out.printf("Number of problems: %d\n", problemCounter);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
