package main.java.conditionalStatementsMoreExercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double magnolias = Double.parseDouble(scanner.nextLine());
        double hyacinths = Double.parseDouble(scanner.nextLine());
        double roses = Double.parseDouble(scanner.nextLine());
        double cactus = Double.parseDouble(scanner.nextLine());
        double theGift = Double.parseDouble(scanner.nextLine());

        double sum = (magnolias * 3.25) + (hyacinths * 4) + (roses * 3.5) + (cactus * 8);
        double duty = sum * 0.95;

        if (theGift > duty) {
            double endResult = Math.ceil(theGift - duty);
            System.out.printf("She will have to borrow %.0f leva.", endResult);
        } else {
            double endResult = Math.floor(duty - theGift);
            System.out.printf("She is left with %.0f leva.", endResult);
        }

    }
}
