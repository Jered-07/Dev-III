package estructuras_Datos;

import java.util.ArrayList;
import java.util.LinkedList;

public class MedicionTiempo {
    public static void main(String[] args) {
        int tamanoLista  = 100000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        long inicioArrayList = System.nanoTime();
        for (int i = 0; i < tamanoLista; i++) {
            arrayList.add(0, i);
            arrayList.get(i);
        }

        long finArrayList = System.nanoTime();
        System.out.println("ArrayList - tiempo de incercion: " + (finArrayList - inicioArrayList) + "ns");


        long inicioLinkedlist = System.nanoTime();
        for (int i = 0; i < tamanoLista; i++) {
            linkedList.addFirst(i);
            linkedList.get(i);
        }

        long finLinkedlist = System.nanoTime();
        System.out.println("LinkedlisList - tiempo de incercion: " + (finLinkedlist - inicioLinkedlist) + "ns");


    }
}