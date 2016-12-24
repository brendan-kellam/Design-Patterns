package state;

public class TestATMMachine {

	public static void main(String[] args){
	
		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1234);
		
		atmMachine.requestCash(2001);
				
	}
	
}
