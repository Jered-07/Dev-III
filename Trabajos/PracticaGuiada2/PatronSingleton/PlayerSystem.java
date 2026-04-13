package PracticaGuiada2.PatronSingleton;

public class PlayerSystem {
    private GameConfig intance;
    private int playerLives;

    public PlayerSystem(){
        intance = GameConfig.getIntance();
        playerLives = intance.getLives();
    }

    public void printPlayerConfig(){
        System.out.println("=== PlayerSystem === " 
        + "\nLives: " + playerLives);
    }
}
