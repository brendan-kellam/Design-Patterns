package singleton;
import java.util.LinkedList;


public class ScrabbleTest {

	public static void main(String[] args){
		
		// create a new instance of the Singleton class
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 1: " + playerOneTiles);
		
		System.out.println(newInstance.getLetterList());
		
		/* ---- PLAYER 2 ---- */
		
		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));
		
		System.out.println(instanceTwo.getLetterList());
		
		LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);
		System.out.println("Player 2: " + playerTwoTiles);
		
		System.out.println(instanceTwo.getLetterList());
	}
}
