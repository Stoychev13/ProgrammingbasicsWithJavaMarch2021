package main.java.conditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String kids = scanner.nextLine();
        double numKids = Double.parseDouble(scanner.nextLine());
        double numOvernights = Double.parseDouble(scanner.nextLine());
        String sport = "";
        double sum = 0;

        if (season.equals("Winter")) {
            switch (kids) {
                case ("boys"):
                    sport = "Judo";
                    sum = numKids * 9.60;
                    sum = sum * numOvernights;
                    break;
                case ("girls"):
                    sport = "Gymnastics";
                    sum = numKids * 9.60;
                    sum = sum * numOvernights;
                    break;
                case ("mixed"):
                    sport = "Ski";
                    sum = numKids * 10;
                    sum = sum * numOvernights;
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (kids) {
                case ("boys"):
                    sport = "Football";
                    sum = numKids * 15;
                    sum = sum * numOvernights;
                    break;
                case ("girls"):
                    sport = "Volleyball";
                    sum = numKids * 15;
                    sum = sum * numOvernights;
                    break;
                case ("mixed"):
                    sport = "Swimming";
                    sum = numKids * 20;
                    sum = sum * numOvernights;
                    break;
            }
        } else if (season.equals("Spring")) {
            switch (kids) {
                case ("boys"):
                    sport = "Tennis";
                    sum = numKids * 7.20;
                    sum = sum * numOvernights;
                    break;
                case ("girls"):
                    sport = "Athletics";
                    sum = numKids * 7.20;
                    sum = sum * numOvernights;
                    break;
                case ("mixed"):
                    sport = "Cycling";
                    sum = numKids * 9.50;
                    sum = sum * numOvernights;
                    break;
            }
        }

        if (numKids >= 10 && numKids < 20) {
            sum = sum * 0.95;
        } else if (numKids >= 20 && numKids < 50) {
            sum = sum * 0.85;
        } else if (numKids >= 50) {
            sum = sum * 0.50;
        }
        System.out.printf("%s %.2f lv.", sport, sum);


    }
}
