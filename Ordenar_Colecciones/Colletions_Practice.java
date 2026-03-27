package Ordenar_Colecciones;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Colletions_Practice {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(5,9,3,8));

        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        
    }
    
}
