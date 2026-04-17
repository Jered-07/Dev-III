package PracticaGuiada2.PatronSingleton;

public class GameConfig {
    private String difficulty;
    private int lives;
    private double enemySpeed;
    private static GameConfig intance;

    private GameConfig() {
        difficulty = "facil";
        lives = 3;
        enemySpeed = 2.5;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getLives() {
        return lives;
    }

    public double getEnemySpeed() {
        return enemySpeed;
    }

    public static GameConfig getIntance() {

        if (intance == null) {
            intance = new GameConfig();
        }

        return intance;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setEnemySpeed(double enemySpeed) {
        this.enemySpeed = enemySpeed;
    }

    public static void setIntance(GameConfig intance) {
        GameConfig.intance = intance;
    }


    public void setLives(int lives) {
        this.lives = lives;
    }

    public void printConfig(){
        System.out.println("==== GlobalConfig ==== " 
        + "\nDifficulty: " + difficulty 
        + "\nlives: " + lives 
        + "\nenemySpeed: " + enemySpeed);
    }

    
}
