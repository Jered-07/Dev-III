package genericos;

public class Main {
    public static void main(String[] args) {
        Caja<Double> cajaDouble = new Caja<>();
        Caja<String> cajaString = new Caja<>();

        cajaDouble.setValor(7.64);
        cajaString.setValor("Eso mi rata");

        System.out.println(cajaDouble.getValor());
        System.out.println(cajaString.getValor());


        
    }
}
