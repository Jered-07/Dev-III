package estructuras_Datos.PracticaGenericos_Colletion.Ejercicio2;

public class Electronic {

    private String name;
    private String brand;
    private int price;

    public Electronic(String name, String brand, int price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){
        return  "["+ " Name: " + name + " brand: " + brand + " price: " + price + " ]";
    }
}
