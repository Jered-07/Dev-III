package PracticaGuiada3.Abstract_Factory;

public class GameBoy_Bloque extends Bloque_Interrogante {

    @Override
    public void resolucion() {
        System.out.println("La resolucion del bloque en la GameBoy es de 4px");
    }

    @Override
    public void power() {
        System.out.println("El poder que tiene que bloque es: Flor de juego");
    }
    
}
