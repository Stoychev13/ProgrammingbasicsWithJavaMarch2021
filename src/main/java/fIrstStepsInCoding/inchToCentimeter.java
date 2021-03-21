package main.java.fIrstStepsInCoding;

import java.util.Scanner;

public class inchToCentimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        double inch =  2.54;
        double cent = num * inch ;
        System.out.println(cent);





    }
}
