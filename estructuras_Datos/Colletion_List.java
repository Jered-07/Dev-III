package estructuras_Datos;

import java.util.ArrayList;
import java.util.List;

public class Colletion_List {
    public static void main(String[] args) {

        List<String> vehiculos =  new ArrayList<String>();
        
        //Metodo add
        vehiculos.add("Bicicleta");
        vehiculos.add("carro");

        System.out.println(vehiculos);


        //Metodo get
        System.out.println("Se estrajo el elemento: " + vehiculos.get(0));
        
        //Metodo set
        vehiculos.set(0, "Avion"); 
        System.out.println(vehiculos);

        //Metodo intexOf
        System.out.println("El elemento esta en la posicion: " + vehiculos.indexOf("carro"));
        System.out.println("El elemento esta en la posicion: " + vehiculos.indexOf("tren"));

        //revome
        System.out.println("Se elimino al elemento: " + vehiculos.remove(1));
        System.out.println(vehiculos);

    }
}
