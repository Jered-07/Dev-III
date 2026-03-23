package estructuras_Datos.PracticaGenericos_Colletion.Ejercicio1;

import java.util.ArrayList;

public class Average {

    public static double getAverage(ArrayList<Integer> notas){

            int suma = 0;

            for (Integer integer : notas) {
                suma = suma + integer;
            }

            return (suma/notas.size());

    }
    
}