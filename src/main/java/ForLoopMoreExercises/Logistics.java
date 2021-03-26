package main.java.ForLoopMoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double allCargo = 0;
        double minibus = 0;
        double truck = 0;
        double train = 0;


        for (int i = 0; i < n; i++) {
            int cargo = Integer.parseInt(scanner.nextLine());

            allCargo += cargo;

            if (cargo <= 3) {
                minibus += cargo;
            }
            if (cargo >= 4 && cargo <= 11) {
                truck += cargo;
            }
            if (cargo >= 12) {
                train += cargo;
            }

        }


        System.out.printf("%.2f\n", (minibus * 200 + truck * 175 + train * 120) / allCargo);
        System.out.printf("%.2f%%\n", minibus / allCargo * 100);
        System.out.printf("%.2f%%\n", truck / allCargo * 100);
        System.out.printf("%.2f%%\n", train / allCargo * 100);

    }
}
