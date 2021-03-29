package main.java.WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookIsFounding = scanner.nextLine();
        String books = scanner.nextLine();

        int booksCounter = 0;

        boolean isFound = false;

        while (!books.equals("No More Books")) {
            if (books.equals(bookIsFounding)) {
                isFound = true;
                break;
            }

            booksCounter++;
            books = scanner.nextLine();
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", booksCounter);
        } else {
            System.out.printf("The book you search is not here!\nYou checked %d books.", booksCounter);
        }


    }
}
