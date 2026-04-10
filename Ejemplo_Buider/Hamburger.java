package Ejemplo_Buider;

public class Hamburger {
    private String pan;
    private String carne;
    private boolean lechuga;
    private boolean queso;
    private boolean mayo;

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setLechuga(boolean lechuga) {
        this.lechuga = lechuga;
    }
    

    public void setMayo(boolean mayo) {
        this.mayo = mayo;
    }

    public void setQueso(boolean queso) {
        this.queso = queso;
    }


    @Override
    public String toString() {
        return "Hamburgesa con:" 
        +  "\n Pan: " + pan 
        + "\n Carne: " + carne 
        + "\n Lechuga: " + (lechuga ? "si" : "no")
        + "\n Queso: " + (queso ? "si" : "no") 
        + "\n Mayo: " + (mayo ? "si": "no") ;
    }
}
