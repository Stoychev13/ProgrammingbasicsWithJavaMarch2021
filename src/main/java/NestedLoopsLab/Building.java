package main.java.NestedLoopsLab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFloors = Integer.parseInt(scanner.nextLine());
        int maxRooms = Integer.parseInt(scanner.nextLine());

        for (int i = maxFloors; i > 0; i--) {
            String floor = "";
            for (int j = 0; j < maxRooms; j++) {
                if (i == maxFloors) {
                    floor += "L" + i + j + " ";
                } else if (i % 2 == 0) {
                    floor += "O" + i + j + " ";
                } else {
                    floor += "A" + i + j + " ";
                }
            }
            System.out.println(floor);
        }
    }
}
