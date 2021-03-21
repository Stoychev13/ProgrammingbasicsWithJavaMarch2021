package main.java.conditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18) {
            switch (day) {
                case ("Morning"):
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case ("Afternoon"):
                case ("Evening"):
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        } else if (degrees > 18 && degrees <= 24) {
            switch (day) {
                case ("Morning"):
                case ("Evening"):
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case ("Afternoon"):
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
            }
        } else {
            switch (day) {
                case ("Morning"):
                    outfit = "T-shirt";
                    shoes = "Sandals";
                    break;
                case ("Afternoon"):
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case ("Evening"):
                    outfit = "Shirt";
                    shoes = "Moccasins";
            }
        }
        System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
