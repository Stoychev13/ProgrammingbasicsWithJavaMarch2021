package main.java.conditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class NumbersFrom1to10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }
    }
}
