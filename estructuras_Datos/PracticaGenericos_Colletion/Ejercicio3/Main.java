package estructuras_Datos.PracticaGenericos_Colletion.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,6,5,7,3));

       List<Integer> reversedList = list.reversed();

        reversedList.forEach(a -> System.out.println(a));

    }
}
