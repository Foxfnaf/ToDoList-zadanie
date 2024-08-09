package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    private List<String> tasks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int taskIndeks;


    public void addTask() {
        System.out.println("Wpisz swoje zadanie.");
        String task = scanner.nextLine();
        tasks.add(task);
        scanner = null;
    }

    public List<String> printTask() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.indexOf(tasks.get(i)) + " " + tasks.get(i));
        }
        scanner = null;
        
        return tasks;
    }

    public void removeTask() {

        System.out.println("Podaj numer zadania (Możesz je sprawdzić wyświetlająć wszystkie zadania. Numery zaczynają się od 0.)");
       taskIndeks = scanner.nextInt();
        tasks.remove(taskIndeks);
        scanner = null;
    }

    public void modifyTask() {
        System.out.println("Podaj numer zadania (Numery zaczynają się od 0)");
        taskIndeks = scanner.nextInt();

        System.out.println("Podaj nowy tekst zadania");
        Scanner userTextReader = new Scanner(System.in);
        String userText = userTextReader.nextLine();

        tasks.set(taskIndeks, userText);
        scanner = null; 
    }
}
