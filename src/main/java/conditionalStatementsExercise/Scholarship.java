package main.java.conditionalStatementsExercise;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double avGrade = Double.parseDouble(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        double socialScholarship = 0;
        double scholarship = 0;


        if (avGrade <= 4.50) {
            System.out.println("You cannot get a scholarship!");
        } else if (avGrade < 5.50) {
            if (income < salary) {
                socialScholarship = Math.floor(0.35 * salary);
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        } else {
            scholarship = Math.floor(avGrade * 25);
            if (income < salary) socialScholarship = Math.floor(0.35 * salary);
            if (socialScholarship > scholarship) {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarship);
            }
        }
    }
}
