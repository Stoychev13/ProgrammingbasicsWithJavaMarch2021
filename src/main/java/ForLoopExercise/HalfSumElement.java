package main.java.ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int biggerNum = Integer.MIN_VALUE;
        int endSum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            endSum = endSum + num;
            if (num > biggerNum) {
                biggerNum = num;
            }
        }
        if (biggerNum == endSum - biggerNum) {
            System.out.printf("Yes\nSum = %d", biggerNum);
        } else {
            biggerNum = Math.abs(biggerNum - (endSum - biggerNum));
            System.out.printf("No\nDiff = %d", biggerNum);
        }
    }
}
