package Practica_map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        //Metodo add
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("app", 2);

        //Metodo buscar
        buscar(map, "ap");
    }

    private static void buscar(Map<String, Integer> m, String prefijo) {
    int sum = 0;

    for (Map.Entry<String, Integer> entry : m.entrySet()) {

        if (entry.getKey().startsWith(prefijo)) {
            sum += entry.getValue();
        }
    }

    System.out.println(sum);
}
}
