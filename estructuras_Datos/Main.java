package estructuras_Datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> vehiculos =  new ArrayList<String>();
        Collection <String> vehiculos2 = new ArrayList<>();

        //Metodo add
        vehiculos.add("Bicicleta");
        vehiculos.add("carro");
        vehiculos.add("helicoptero");
        vehiculos.add("avion");
        vehiculos.add("Tren");
        vehiculos2.add("Titanic");

        vehiculos2.addAll(vehiculos);
        

        //vehiculos.forEach(vehiculo -> System.out.println(vehiculo));



        System.out.println("La lista esta vacia?" + vehiculos.isEmpty());
        System.out.println("El size de la lista es de: " + vehiculos.size());
        System.out.println("La lista contiene la variable solicitada? " + vehiculos.contains("Tren"));
        System.out.println("La lista contiene las variables de las otras listas? "+ vehiculos.containsAll(vehiculos2));
        System.out.println("La lista contiene la otra lista? " + vehiculos.equals(vehiculos2));
        System.out.println("Se removio una variable de la lista?" + vehiculos.remove("avion"));
        System.out.println("Se removio todas las variables de una lista de la otra?" + vehiculos2.removeAll(vehiculos));    

        
        vehiculos.get(0);

    }
}
