package main.java.conditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figures = scanner.nextLine();
        double area = 0;

        switch (figures) {
            case "square": {
                double num = Double.parseDouble(scanner.nextLine());
                area = num * num;
                break;
            }
            case "rectangle": {
                double num = Double.parseDouble(scanner.nextLine());
                double num2 = Double.parseDouble(scanner.nextLine());
                area = num * num2;
                break;
            }
            case "circle": {
                double num = Double.parseDouble(scanner.nextLine());
                area = Math.PI * num * num;
                break;
            }
            case "triangle": {
                double num = Double.parseDouble(scanner.nextLine());
                double num2 = Double.parseDouble(scanner.nextLine());
                area = num * num2;
                area = area / 2;
                break;
            }
        }
        System.out.printf("%.3f", area);

    }
}
