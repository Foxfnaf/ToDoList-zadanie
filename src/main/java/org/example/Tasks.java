package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    private List<String> tasks = new ArrayList<>();
    public int i = 0;
    Scanner scanner = new Scanner(System.in);
    int taskIndeks;


    public void addTask() {
        System.out.println("Wpisz swoje zadanie.");
        String task = scanner.nextLine();
        tasks.add(i + " " + task);
    }

    public List<String> printTask() {
        return tasks;
    }

    public void removeTask() {

        System.out.println("Podaj numer zadania (Możesz je sprawdzić wyświetlająć wszystkie zadania. Numery zaczynają się od 0.)");
       taskIndeks = scanner.nextInt();
        tasks.remove(taskIndeks);
    }

    public void modifyTask() {
        System.out.println("Podaj numer zadania (Numery zaczynają się od 0)");
        taskIndeks = scanner.nextInt();

        System.out.println("Podaj nowy tekst zadania");
        String userText = scanner.nextLine();
        tasks.set(taskIndeks, userText);
    }
}
