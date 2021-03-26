package main.java.ForLoopMoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double treatedPatient = 0;
        double unTreatedPatient = 0;
        double doctors = 7;


        for (int i = 1; i <= n; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && unTreatedPatient > treatedPatient) {
                doctors++;
            }

            if (patients > doctors) {
                treatedPatient += doctors;
                unTreatedPatient += patients - doctors;
            } else {
                treatedPatient += patients;
            }
        }
        System.out.printf("Treated patients: %.0f.\n", treatedPatient);
        System.out.printf("Untreated patients: %.0f.", unTreatedPatient);

    }
}
