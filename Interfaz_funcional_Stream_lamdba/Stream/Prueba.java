package Interfaz_funcional_Stream_lamdba.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Prueba {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        List<Integer> result = numbers.stream()
            .filter(number -> number % 2 == 0)
            .map(number -> number * 10)
            .collect(Collectors.toList());

            System.out.println(result);
    }
}
