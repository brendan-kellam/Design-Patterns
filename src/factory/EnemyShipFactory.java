package factory;


public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String newShipType){
				
		switch (newShipType) {
			case("U"): 
				return new UFOEnemyShip();
			
			case("R"):
				return new RocketEnemyShip();
			
			case("B"):
				return new BigUFOEnemyShip();
			
			default:
				return null;
		}
	}
	
}
