package PracticaGuiada3.Abstract_Factory;

public class GameBoyMoneda extends Moneda {
    
    @Override
    public void resolution() {
        System.out.println("La resolucion de la moneda en la GameBoy es de 4px");
    };

    @Override
    public void valor() {
        System.err.println("El valor de la moneda es de 20");
    };
}
