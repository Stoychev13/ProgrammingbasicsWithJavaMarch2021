package main.java.ForLoopExercise;

import java.util.Scanner;

public class NumbersEndingInSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 7; i <= 997; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
