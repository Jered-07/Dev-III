package estructuras_Datos.PracticaGenericos_Colletion.Ejercicio1;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(85);
        notas.add(95);
        notas.add(74);

        System.out.println("El promedio de las notas es: "+ Average.getAverage(notas));


    }
}
