package main.java.firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double perimeter = Math.PI * r * r;
        double area = 2 * Math.PI * r;

        System.out.printf("%.2f", perimeter);
        System.out.println();
        System.out.printf("%.2f", area);

    }
}
