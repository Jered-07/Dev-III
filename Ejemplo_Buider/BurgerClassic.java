package Ejemplo_Buider;

public class BurgerClassic implements Builder {

    private Hamburger result;

    public BurgerClassic (){
        reset();
    }

     @Override
    public void reset() {
        result = new Hamburger();
    }

    @Override
    public void setpan() {
        result.setPan("Clasico");
    }

    @Override
    public void setLechuga() {
        result.setLechuga(true);
    }

    @Override
    public void setQueso() {
        result.setQueso(true);
    }

    @Override
    public void setCarne() {
        result.setCarne("Res");
    }

    @Override
    public void setMayo() {
        result.setMayo(true);
    }

    @Override
    public Hamburger resul() {
       return result;
    }

   
}
