package PracticaGuiada3.Abstract_Factory;

public class GameBoyItemFactory implements AbstractFactory {

    @Override
    public Bloque_Interrogante createBloqueInterrogante() {
        return new GameBoy_Bloque();
    }

    @Override
    public Moneda createMoneda() {
        return new GameBoyMoneda();
    }
    
}
