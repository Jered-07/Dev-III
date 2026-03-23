package estructuras_Datos;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Set_Practice {
    public static void main(String[] args) {
         Set<String> set1 = new TreeSet<>();

         set1.add("Adam");
         set1.add("Mary");
         set1.add("Katy");
         set1.add("Katy");
         set1.add("Rafa");
         set1.add("Brayan");

         for (String s : set1) {
            System.out.println(s);
         }

    }
   

}
