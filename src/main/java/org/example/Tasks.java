package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    private List<String> tasks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    private void addTask() {
        System.out.println("Wpisz swoje zadanie");
        String task = scanner.nextLine();
        tasks.add(task);
    }

    private List<String> getTask() {
        return tasks;
    }
}
