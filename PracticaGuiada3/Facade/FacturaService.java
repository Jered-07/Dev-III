package PracticaGuiada3.Facade;

public class FacturaService {
    public void generarFactura(String cliente, String platillo){
        System.out.println("\n === Factura de la Orden===");
        System.out.println("Nombre del cliente: " + cliente 
        + "\nplatillo que ordeno: " + platillo );
    }
}
