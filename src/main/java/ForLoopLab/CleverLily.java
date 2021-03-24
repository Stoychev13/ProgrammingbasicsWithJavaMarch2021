package main.java.ForLoopLab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int priceForToy = Integer.parseInt(scanner.nextLine());

        double money = 0;
        double toys = 0;
        double secondMoney = 0;
        double counter = 0;


        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                secondMoney = secondMoney + money;
                counter++;
            }
            if (i % 2 != 0) {
                toys += 1;
            }
        }
        double endPriceForToys = toys * priceForToy;
        double allMoney = endPriceForToys + secondMoney - counter;
        if (allMoney >= washMachinePrice) {
            double endPrice = allMoney - washMachinePrice;
            System.out.printf("Yes! %.2f", endPrice);
        } else {
            double endPrice = Math.abs(washMachinePrice - allMoney);
            System.out.printf("No! %.2f", endPrice);
        }


    }
}
