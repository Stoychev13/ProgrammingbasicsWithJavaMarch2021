package main.java.NestedLoopsLab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();

        int counterTickets = 0;
        int counterStudents = 0;
        int counterStandard = 0;
        int counterKids = 0;

        boolean isFinished = false;

        while (!film.equals("Finish")) {
            if (film.equals("kid")) {
                continue;
            }
            if (film.equals("standard")) {
                continue;
            }
            if (film.equals("student")) {
                continue;
            }

            int places = Integer.parseInt(scanner.nextLine());
            String typeTickets = scanner.nextLine();
            int counterTicketsPerMovie = 0;

            while (!typeTickets.equals("End")) {

                if (typeTickets.equals("Finish")) {
                    isFinished = true;
                    break;
                }
                counterTickets++;
                counterTicketsPerMovie++;

                if (typeTickets.equals("kid")) {
                    counterKids++;
                }
                if (typeTickets.equals("standard")) {
                    counterStandard++;
                }
                if (typeTickets.equals("student")) {
                    counterStudents++;
                }

                if (counterTicketsPerMovie >= places) {
                    break;
                }

                typeTickets = scanner.nextLine();
            }
            double percentFull = ((counterTicketsPerMovie * 1.0) / places) * 100;
            System.out.printf("%s - %.2f%% full.\n", film, percentFull);

            if (isFinished) {
                break;
            }
            film = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", counterTickets);

        double percentStudents = (counterStudents * 1.0 / counterTickets) * 100;
        double percentKids = (counterKids * 1.0 / counterTickets) * 100;
        double percentStandard = (counterStandard * 1.0 / counterTickets) * 100;

        System.out.printf("%.2f%% student tickets.\n%.2f%% standard tickets.\n%.2f%% kids tickets.", percentStudents, percentStandard, percentKids);

    }

}

