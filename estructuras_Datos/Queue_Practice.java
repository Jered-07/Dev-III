package estructuras_Datos;

import java.util.PriorityQueue;

public class Queue_Practice {
    public static void main(String[] args) {
        PriorityQueue<String> cola = new PriorityQueue<>();

        cola.offer("Carlos");
        cola.offer("Ana");
        cola.offer("Luis");

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }    
    }
}
