package singleton;
import java.util.LinkedList;

/**
 * <h1> GetTheTiles </h1>
 * <p>Class used for thread creation</p>
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
