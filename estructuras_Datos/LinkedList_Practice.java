package estructuras_Datos;

import java.util.LinkedList;

public class LinkedList_Practice {
    public static void main(String[] args) {
        LinkedList<String> ropaInvierno = new LinkedList<>();

        System.out.println("=== ANTES ===");
        ropaInvierno.add("abrigo");
        ropaInvierno.add("medias");
        ropaInvierno.add("botas");

        ropaInvierno.forEach(prenda -> System.out.println(prenda));
        System.out.println("=== DESPUES ===");

        ropaInvierno.addFirst("Bufanda");
        ropaInvierno.addLast("Bufanda");

        ropaInvierno.forEach(prenda -> System.out.println(prenda));


    }
}
