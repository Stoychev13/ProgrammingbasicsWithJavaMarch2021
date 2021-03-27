package main.java.ForLoopMoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadium = Integer.parseInt(scanner.nextLine());
        double allFans = Double.parseDouble(scanner.nextLine());

        double a = 0;
        double b = 0;
        double v = 0;
        double g = 0;

        for (int i = 0; i < allFans; i++) {
            String fans = scanner.nextLine();

            if (fans.equals("A")) {
                a++;
            } else if (fans.equals("B")) {
                b++;
            } else if (fans.equals("V")) {
                v++;
            } else if (fans.equals("G")) {
                g++;
            }
        }
        System.out.printf("%.2f%%\n", a / allFans * 100);
        System.out.printf("%.2f%%\n", b / allFans * 100);
        System.out.printf("%.2f%%\n", v / allFans * 100);
        System.out.printf("%.2f%%\n", g / allFans * 100);
        System.out.printf("%.2f%%\n", allFans / stadium * 100);

    }
}
