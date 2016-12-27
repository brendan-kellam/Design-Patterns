package factory;
import java.util.Scanner;

public class EnemyShipTesting {

		public static void main(String[] args){
			
			EnemyShipFactory shipFactory = new EnemyShipFactory();
			EnemyShip theEnemy = null;
			
			// The user at run time can dynamically add a new enemy ship 
			String enemyShipOption = "";
			Scanner input = new Scanner(System.in);
			
			System.out.println("What type of ship? (U / R / B)");
			
			if (input.hasNextLine()){
				enemyShipOption = input.nextLine();
				
				theEnemy = shipFactory.makeEnemyShip(enemyShipOption);
			}
			
			if (theEnemy != null){
				doStuffEnemy(theEnemy);
			} else System.out.println("Enter U, R or B");
			
			
			
			/*
			// BIG RED FLAG
			if (enemyShipOption.equals("U")){
				theEnemy = new UFOEnemyShip();
			} else {
				if (enemyShipOption.equals("R")){
					theEnemy = new RocketEnemyShip();
				}
			}*/
			
			
		}
		
		
		/** 
		 * OLD WAY OF DOING THINGS
		*/
		public static void doStuffEnemy(EnemyShip anEnemyShip){
			anEnemyShip.displayEnemyShip();
			anEnemyShip.followHeroShip();
			anEnemyShip.enemyShipShoots();
		}
	
}
