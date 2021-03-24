package main.java.ForLoopLab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > big) {
                big = num;
            }
            if (num < small) {
                small = num;
            }
        }
        System.out.printf("Max number: %d%n", big);
        System.out.printf("Min number: %d", small);
    }
}
