package PracticaGuiada3.Facade;

public class RestaurantFacade {
    private MesaService mesaService;
    private CocinaServise cocinaServise;
    private FacturaService facturaService;
    private NotificacionService notificacionService;


    public RestaurantFacade(MesaService mesaService, CocinaServise cocinaServise, FacturaService facturaService, NotificacionService notificacionService){
        this.cocinaServise = cocinaServise;
        this.facturaService = facturaService;
        this.mesaService = mesaService;
        this.notificacionService = notificacionService;
    }

    public void realizarPedido(String cliente, String platillo, boolean disponible){
        mesaService.verificarMesaDisponible(disponible);
        cocinaServise.registrarOrden(platillo);
        facturaService.generarFactura(cliente, platillo);
        notificacionService.enviarNotificacion(cliente);
    }
}
