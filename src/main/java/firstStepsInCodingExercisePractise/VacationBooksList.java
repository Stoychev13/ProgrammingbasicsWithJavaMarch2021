package main.java.firstStepsInCodingExercisePractise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int numDays = Integer.parseInt(scanner.nextLine());

        int allTimeForReadBook = numPages / pages;
        int endTime = allTimeForReadBook / numDays;

        System.out.println(endTime);

    }
}
