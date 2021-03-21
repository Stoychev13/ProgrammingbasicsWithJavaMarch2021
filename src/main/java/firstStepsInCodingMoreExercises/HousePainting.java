package main.java.firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y;
        double window = 1.5 * 1.5;
        double twoSides = 2 * sideWall - 2 * window;
        double backWall = x * x;
        double door = 1.2 * 2;
        double frontAndRear = 2 * backWall - door;
        double totalArea = twoSides + frontAndRear;
        double greenPaint = totalArea / 3.4;


        double twoRectanglesOnTheRoof = 2 * (x * y);
        double twoTriangles = 2 * (x * h / 2);
        double area = twoRectanglesOnTheRoof + twoTriangles;
        double redPaint = area / 4.3;

        System.out.printf("%.2f", greenPaint);
        System.out.println();
        System.out.printf("%.2f", redPaint);
    }
}
