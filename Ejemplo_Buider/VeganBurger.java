package Ejemplo_Buider;

public class VeganBurger implements Builder {
    private Hamburger result;


    public VeganBurger(){
        reset();
    }

    @Override
    public Hamburger resul() {
        return result;
    }

    @Override
    public void reset() {
        result = new Hamburger();
    }

    @Override
    public void setpan() {
        result.setPan("Integral");
    }

    @Override
    public void setLechuga() {
        result.setLechuga(true);
    }

    @Override
    public void setQueso() {
        result.setQueso(false);
    }

    @Override
    public void setCarne() {
        result.setCarne("Vegetal");
    }

    @Override
    public void setMayo() {
        result.setMayo(true);
    }

}
