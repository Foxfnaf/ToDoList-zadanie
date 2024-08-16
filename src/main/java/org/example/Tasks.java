package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    private List<String> tasks = new ArrayList<>();
    public Scanner tasksScanner = new Scanner(System.in);
    int taskIndeks;


    public void addTask() {
        System.out.println("Wpisz swoje zadanie.");
        String task = tasksScanner.nextLine();
        tasks.add(task);
    }

    public List<String> printTask() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.indexOf(tasks.get(i)) + " " + tasks.get(i));
        }

        return tasks;
    }

    public List<String> removeTask() {

        System.out.println("Podaj numer zadania (Możesz je sprawdzić wyświetlająć wszystkie zadania. Numery zaczynają się od 0.)");
       taskIndeks = tasksScanner.nextInt();
        tasks.remove(taskIndeks);
        return tasks;
    }

    public List<String> modificationOfTask() {
        System.out.println("Podaj numer zadania (Numery zaczynają się od 0)");
        taskIndeks = tasksScanner.nextInt();

        System.out.println("Podaj nowy tekst zadania");
        Scanner userTextReader = new Scanner(System.in);
        String userText = userTextReader.nextLine();

        tasks.set(taskIndeks, userText);
        return tasks;
    }
}
