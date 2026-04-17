package PracticaGuiada3.Abstract_Factory;

public class NintendoDSItemFactory implements AbstractFactory{

    @Override
    public Bloque_Interrogante createBloqueInterrogante() {
        return new NintendoDS_Bloque();
    }

    @Override
    public Moneda createMoneda() {
        return new NintendoDS_Moneda();
    }
    
}
