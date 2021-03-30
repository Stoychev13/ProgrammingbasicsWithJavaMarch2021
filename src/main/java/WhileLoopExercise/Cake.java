package main.java.WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());

        int sum = height * weight;
        int getPiece = 0;

        String command = "";

        while (sum >= 0) {
            command = scanner.nextLine();

            if (command.equals("STOP")) {
                System.out.printf("%d pieces are left.", sum);
                break;
            } else {
                getPiece = Integer.parseInt(command);
                sum -= getPiece;
            }
        }
        if (!command.equals("STOP")) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(sum));
        }


    }
}
