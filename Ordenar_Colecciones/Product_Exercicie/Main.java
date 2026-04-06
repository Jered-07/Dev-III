package Ordenar_Colecciones.Product_Exercicie;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private static ArrayList<Product> products = new ArrayList<>();
    public static void main(String[] args) {

        add(new Product("Leche", 1043, 5));
        add(new Product("Huevos", 2000, 10));
        add(new Product("Arroz", 1500, 6));    
        add(new Product("Pan", 934, 2));

        //Orden Natural
        System.out.println("==== Orden Natural ====");
        Collections.sort(products);
        printList();
        System.out.println(" ");

        //Odenamiento por nombre
        System.out.println("==== Orden Por Nombre ====");
        Collections.sort(products, new ComparePerName());
        printList();
        System.out.println(" ");

        //Odenamiento por precio
        System.out.println("==== Orden Por Precio ====");
        Collections.sort(products, new ComparePerPrice());
        printList();
        
    }

    private static void printList(){
        products.forEach(product -> System.out.println(product));
    }

    private static void add(Product p){
      products.add(p);
    }
}
