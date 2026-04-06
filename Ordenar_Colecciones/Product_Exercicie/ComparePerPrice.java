package Ordenar_Colecciones.Product_Exercicie;

import java.util.Comparator;

public class ComparePerPrice implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
      return Integer.compare(p1.getPrice(), p2.getPrice());
    }
    

    
}