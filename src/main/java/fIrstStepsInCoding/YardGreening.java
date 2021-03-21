package main.java.fIrstStepsInCoding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double parcelMeter = Double.parseDouble(scanner.nextLine());

        double priceForGrassing = parcelMeter * 7.61;
        double discount = priceForGrassing * 0.18;
        double endPrice = priceForGrassing - discount;

        System.out.printf("The final price is: %.2f lv.", endPrice);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
