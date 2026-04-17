package PracticaGuiada3.Facade;

public class NotificacionService {
    public void enviarNotificacion(String cliente){
        System.out.println("\n=== Notificacion === " 
        + "\n" + cliente + " su pedido esta de camino");
    }
}
