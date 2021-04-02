package main.java.NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();

        double average = 0;
        double gradeCounter = 0;
        double counter = 0;
        double sumGrade = 0;
        double Grade = 0;

        while (!name.equals("Finish")) {
            sumGrade = 0;
            for (gradeCounter = 1.00; gradeCounter <= people; gradeCounter++) {
                double grade = Double.parseDouble(scanner.nextLine());

                Grade += grade;
                sumGrade += grade;
                counter++;
                if (gradeCounter == people) {
                    average = sumGrade / people;
                    break;
                }
            }
            if (!name.equals("Finish")) {
                System.out.printf("%s - %.2f.%n", name, average);
            }
            name = scanner.nextLine();
        }
        if (name.equals("Finish")) {

            double totalGrade = Grade / counter;
            System.out.printf("Student's final assessment is %.2f.", totalGrade);
        }

    }
}
