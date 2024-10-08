package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        while (true) {
            System.out.println("1: Dodaj zadanie");
            System.out.println("2: Wyświetl zadania");
            System.out.println("3: Usuń zadanie");
            System.out.println("4: Modifikuj zadanie");

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> {
                    System.out.println();
                    tasks.addTask();
                }
                case 2 -> {
                    System.out.println();
                    tasks.printTask();
                }
                case 3 -> {
                    System.out.println();
                    tasks.removeTask();
                }
                case 4 -> {
                    System.out.println();
                    tasks.modificationOfTask();
                }
            }
        }
    }
}