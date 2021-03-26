package main.java.ForLoopMoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double year = Double.parseDouble(scanner.nextLine());
        double age = 18;
        int moneyForOneYear = 12000;
        double endResult = 0;


        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                money -= moneyForOneYear;
            } else {
                money -= moneyForOneYear + 50 * age;
            }
            age++;
        }
        if (money >= endResult) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
