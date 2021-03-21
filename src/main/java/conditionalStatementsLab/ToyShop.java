package main.java.conditionalStatementsLab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCnt = Integer.parseInt(scanner.nextLine());
        int talkingDollsCnt = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minionsCnt = Integer.parseInt(scanner.nextLine());
        int trucksCnt = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = puzzleCnt * 2.60;
        double talkingDollPrice = talkingDollsCnt * 3;
        double teddyBearPrice = teddyBear * 4.10;
        double minionsPrice = minionsCnt * 8.20;
        double trucksPrice = trucksCnt * 2;

        double totalPrice = puzzlePrice + talkingDollPrice + teddyBearPrice + minionsPrice + trucksPrice;
        int toysTotalCnt = puzzleCnt + talkingDollsCnt + teddyBear + minionsCnt + trucksCnt;

        if (toysTotalCnt >= 50) {
            totalPrice = totalPrice * 0.75;
        }
        totalPrice = totalPrice * 0.90;

        if (totalPrice >= excursionPrice) {
            double moneyLeft = totalPrice - excursionPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            double moneyNeed = excursionPrice - totalPrice;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeed);
        }

    }
}
