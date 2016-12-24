package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * <h1> Singleton </h1>
 * - firstIntance : Singleton <br>
 * -------------------------- <br>
 * - Singleton()			  <br>
 * + getInstance() : Singleton <br>
 * 
 * <p>Only allows the creation of one static instance of a given class</p>
 */

public class Singleton {
	
	// holds the one and ONLY instance of this class
	private static Singleton firstInstance = null;
	
	String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
			"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e", 
			"e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", 
			"h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", 
			"l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o", 
			"o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", 
			"r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u", 
			"u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};  
	
	private LinkedList<String> letterList = new LinkedList<String> (Arrays.asList(scrabbleLetters));
	
	static boolean firstThread = true;

	// intentionally private
	private Singleton(){ }
	
	
	public static Singleton getInstance(){
		
		// create a new instance if not yet created
		if (firstInstance == null){
			
			if(firstThread){
				firstThread = false;
				
				Thread.currentThread(); 
				
				// This is used to create synchronized errors for the
				// purposes of a example
				try {
					Thread.sleep(1000); // First thread sleeping
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			/* NOTE: This provides synchronizations between two different threads attempting to accsess this singleton class */
			synchronized(Singleton.class){
				
				if (firstInstance == null) { 
					firstInstance = new Singleton();
				
					// shuffle the linked list
					Collections.shuffle(firstInstance.letterList);
				}
			}
			
			
		}
		
		return firstInstance;
	}
	
	public LinkedList<String> getLetterList(){
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles){
		LinkedList<String> tilesToSend = new LinkedList<String>();
		
		for (int i = 0; i <= howManyTiles; i++){
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		
		return tilesToSend;
	}
	
	
}
