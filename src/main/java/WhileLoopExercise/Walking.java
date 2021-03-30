package main.java.WhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = null;
        int steps = 0;

        while (steps < 10000 && !"Going home".equals(input = scanner.nextLine())) {
            steps += Integer.parseInt(input);
        }
        if ("Going home".equals(input)) {
            steps += Integer.parseInt(scanner.nextLine());
        }

        if (steps < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - steps);
        } else {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", steps - 10000);
        }
    }
}
