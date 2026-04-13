package PracticaGuiada2.PatronSingleton;

public class EnemySystem {
    
    private GameConfig intance;
    private double enemySpeed;

    public EnemySystem(){
        intance = GameConfig.getIntance();
        enemySpeed = intance.getEnemySpeed();
    }

    public void printEnemyConfig(){
        System.out.println( "=== EnemySystem ===" 
        + "\nenemySpeed: " + enemySpeed);
    }

    

    
}
