package estructuras_Datos;

import java.util.ArrayList;
import java.util.Collection;

public class Practica {
    
    public static void main(String[] args) {

        Collection<String> nombres = new ArrayList<>();

        //Se agregan algunos nombres a la colección

        nombres.add("Diego");
        nombres.add("Rafa");
        nombres.add("Jered");
        nombres.add("Keylor");

        //Se muestran los nombres de la lista
        nombres.forEach(nombre -> System.out.println(nombre));

        System.out.println("La lista contiene la variable solicitada " + nombres.contains("Rafa"));

        nombres.remove("Keylor");

        nombres.forEach(nombre -> System.out.println(nombre));

    }
}
