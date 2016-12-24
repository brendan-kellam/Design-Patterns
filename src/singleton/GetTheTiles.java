package singleton;
import java.util.LinkedList;

/**
 * NOTE: This class provides a example
 */

public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> tiles = newInstance.getTiles(7);

		System.out.println("Player: " + tiles);
	
		System.out.println("Got Tiles");
		
	}

}
