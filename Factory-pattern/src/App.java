import java.util.Scanner;

import Enemies.Enemy;
import Factories.EnemyFactory;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        Enemy currentEnemy = null;

        while (isRunning) {
            System.out.println("Choose an enemy type!\n");
            System.out.println("U => UFO enemy");
            System.out.println("R => Rocket enemy");
            System.out.println("SR => Super Rocket enemy");
            System.out.println("------");
            System.out.println("X => Close CLI");

            String nextLine = scanner.nextLine();

            if(nextLine.equals("X")){
                isRunning = false;
                break;
            }

            currentEnemy = EnemyFactory.createEnemy(nextLine);
            
            showEnemyInfos(currentEnemy);
        }

        scanner.close();
    }

    public static void showEnemyInfos(Enemy enemy){
        System.out.println("-----------------------");
        System.out.println("Name: " + enemy.getName());
        System.out.println("Speed: " + enemy.getSpeed());
        System.out.println("Damage: " + enemy.getDamage());
        System.out.println("-----------------------\n");
    }
}
