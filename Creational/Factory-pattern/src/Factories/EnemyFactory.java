package Factories;

import Enemies.Enemy;
import Enemies.RocketEnemy;
import Enemies.SuperRocketEnemy;
import Enemies.UFOEnemy;

public class EnemyFactory {
    public static Enemy createEnemy(String enemyType){
        Enemy enemy = null;

        switch (enemyType) {
            case "U":
                enemy = new UFOEnemy();
                break;
            case "R":
                enemy = new RocketEnemy();
                break;
            case "SR":
                enemy = new SuperRocketEnemy();
                break;
        }

        return enemy;
    }
}
