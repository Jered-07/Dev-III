package estructuras_Datos.PracticaGenericos_Colletion.Ejercicio2;

public class Food {
    private String name;
    private String caducateDate;
    private int quantity;

    public Food(String name, String caducateDate, int quantity){
        this.name = name;
        this.caducateDate = caducateDate;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCaducateDate() {
        return caducateDate;
    }

    public int getQuantity() {
        return quantity;
    }
}
