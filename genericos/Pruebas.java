package genericos;

import java.util.ArrayList;
import java.util.List;

public class Pruebas {

    public <T> T nombreMetodo(T value){
        return value;
    }

    public static void printLista(List<? super Integer> lista) {
        for (Object object : lista) {
            System.out.println(object);
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(764);
        numbers.add(5764);
        printLista(numbers);
    }
}
