package PracticaGuiada3.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        GameBoyItemFactory gameBoyFactory = new GameBoyItemFactory();
        NintendoDSItemFactory nintendoDSFactory = new NintendoDSItemFactory();

        System.out.println("=== Objetos de la GameBoy ===");

        gameBoyFactory.createMoneda().valor();
        gameBoyFactory.createBloqueInterrogante().power();


        System.out.println("\n=== Objetos de la Nintendo DS ====");

        nintendoDSFactory.createMoneda().valor();
        nintendoDSFactory.createBloqueInterrogante().power();
    }
}
