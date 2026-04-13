package PracticaGuiada2.PatronSingleton;

public class Main {
    public static void main(String[] args) {

        GameConfig globalConfig = GameConfig.getIntance();
        globalConfig.setDifficulty("Media");
        globalConfig.setEnemySpeed(4.3);
        globalConfig.setLives(4);
        globalConfig.printConfig();

        EnemySystem enemySystem = new EnemySystem();
        enemySystem.printEnemyConfig();

        PlayerSystem playerSystem = new PlayerSystem();
        playerSystem.printPlayerConfig();
    }
}
