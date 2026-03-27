package Ordenar_Colecciones.Task_Exercice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Lavar", 2));
        tasks.add(new Task("cocinar", 3));
        tasks.add(new Task("Trabajar", 8));
        tasks.add(new Task("Ejercicio", 1));

        Collections.sort(tasks);

        tasks.forEach(task -> System.out.println(task));

    }
}
