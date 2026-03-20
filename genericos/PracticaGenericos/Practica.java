package genericos.PracticaGenericos;

public class Practica {
    

    //Mostrar 
    private static <T> void mostrarGenerico (T value){
        System.out.println(value);
    }

    //Intercambiar
    private static <T> void Swap(T value1, T value2){

        System.out.println(value1 + " " + value2);

        T temp = value1;
        value1 = value2;
        value2 = temp;

        System.out.println(value1 + " " + value2);
    }


    //CompararValores
    private static <T> boolean CompararValores(T value1, T value2){
        if (value1 == value2) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {

        //Mostrar

        String nombre = "Rafa";
        Double plata = 200.0;
        Integer edad = 19;

        mostrarGenerico(nombre);
        mostrarGenerico(plata);
        mostrarGenerico(edad);


        //Intercambiar


        String nombreI =  "Jered";
        String apellido = "Arias";
        Double plata1 = 5866548.687;
        Double plata2 = 586.97;
        Integer edad1 = 12;
        Integer edad2 = 19;


        Swap(nombreI, apellido);
        Swap(plata1, plata2);
        Swap(edad1, edad2); 

         //CompararValores
          
        Integer number1 = 83;
        Integer number2 = 64;
        String text1 = new String();
        String text2 = new String();

        System.out.println(text1.equals(text2)); //** Para objetos SIEMPRE se recomienda usar el equals
        System.out.println(CompararValores(number1, number2)); 
    }

}
