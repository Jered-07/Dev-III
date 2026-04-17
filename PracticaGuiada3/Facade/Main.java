package PracticaGuiada3.Facade;

public class Main {
    public static void main(String[] args) {
        RestaurantFacade restaurant = new RestaurantFacade(new MesaService(), new CocinaServise(), new FacturaService(), new NotificacionService());

        restaurant.realizarPedido("Jered", "Macarrones en salsa blanca", true);
    }
}
