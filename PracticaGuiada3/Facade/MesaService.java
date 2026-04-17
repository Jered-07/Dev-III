package PracticaGuiada3.Facade;

public class MesaService {
    public void verificarMesaDisponible(boolean diponible){
        System.out.println("=== Condicion de la mesa ===");
        if (diponible == true) {
            System.out.println("La mesa esta diponible");
        }else{
            System.out.println("No hay mesas disponibles");
        }
       
    }
}
