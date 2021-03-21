package main.java.fIrstStepsInCoding;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName , secondName , age , city);
    }
}
