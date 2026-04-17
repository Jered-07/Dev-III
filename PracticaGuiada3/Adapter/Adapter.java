package PracticaGuiada3.Adapter;

public class Adapter implements ConextionType{

    private Foreign specialConextion;

    public Adapter(Foreign specialConextion){
        this.specialConextion = specialConextion;
    }

    @Override
    public void conextion() {
        specialConextion.foreignConextion();
    }
    
}
