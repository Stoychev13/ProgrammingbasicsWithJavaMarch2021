package main.java.ForLoopMoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());
        double averageGrade = 0;
        double fail = 0;
        double betweenThree = 0;
        double betweenFour = 0;
        double topStudents = 0;

        for (int i = 0; i < numStudents; i++) {
            double examGrade = Double.parseDouble(scanner.nextLine());

            averageGrade += examGrade;

            if (examGrade >= 2.00 && examGrade <= 2.99) {
                fail++;
            } else if (examGrade >= 3 && examGrade <= 3.99) {
                betweenThree++;
            } else if (examGrade >= 4 && examGrade <= 4.99) {
                betweenFour++;
            } else {
                topStudents++;
            }
        }

        System.out.printf("Top students: %.2f%%\n", topStudents / numStudents * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", betweenFour / numStudents * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", betweenThree / numStudents * 100);
        System.out.printf("Fail: %.2f%%\n", fail / numStudents * 100);
        System.out.printf("Average: %.2f", averageGrade / numStudents);
    }
}
