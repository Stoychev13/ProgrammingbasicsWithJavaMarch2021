package main.java.ForLoopMoreExercises;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int hours = 0; hours < 24; hours++) {
            for (int minuets = 0; minuets < 60; minuets++) {
                System.out.println(hours + " : " + minuets);
            }
        }
    }
}
