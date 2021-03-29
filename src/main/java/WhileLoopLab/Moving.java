package main.java.WhileLoopLab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int space = wight * length * height;
        int anotherSpace = 0;
        int endResult = 0;

        String stopCommand = scanner.nextLine();

        while (!stopCommand.equals("Done")) {
            int num = Integer.parseInt(stopCommand);

            anotherSpace += num;

            if (anotherSpace > space) {
                break;
            }

            stopCommand = scanner.nextLine();
        }
        if (anotherSpace > space) {
            endResult = Math.abs(space - anotherSpace);
            System.out.printf("No more free space! You need %d Cubic meters more.", endResult);
        } else {
            endResult = space - anotherSpace;
            System.out.printf("%d Cubic meters left.", endResult);
        }


    }
}
