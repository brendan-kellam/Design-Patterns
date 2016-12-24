package state;

/**
 * <h1> ATMMachine : Class </h1>
 * ATMState atmState <br>
 * ATMState hasCard  <br>
 * ATMState noCard   <br>
 * ATMState hasCorrectPin   <br>
 * ATMState atmOutOfMoney   <br>
 * int cashInMachine <br>
 * boolean correctPinEntered <br>
 * ---------------------------- <br>
 * + setATMState(ATMState) : void <br>
 * + setCashInMachine(int) : void <br>
 * + insertCard() : void <br>
 * + ejectCard() : void <br>
 * + requestCash(int) : void <br>
 * + insertPin(int) : void <br>
 * 
 * <p>
 * Provides a context for all states of the ATMs
 * </p>
 * 
 **/

public class ATMMachine {
	
	
	// --- define the different states ---
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	ATMState atmState; // current state of ATM

	
	int cashInMachine = 2000;
	boolean correctPinEntered = false;
	
	
	// constructor 
	public ATMMachine(){
		
		// initialize the states
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		
		// set current state
		atmState = noCard;
		
		if (cashInMachine < 0) {
			atmState = atmOutOfMoney;
		}
	}
	
	
	// allows a given state to change the ATM's state
	void setATMState(ATMState newATMState){
		atmState = newATMState;
	}

	public void setChashInMachine(int newCashInMachine){
		cashInMachine = newCashInMachine;
	}
	
	/* --- Define generalized methods for 3rd party usage ---
	 * NOTE: Each method provides a abstracted gateway to the current ATMs state's corresponding method */
	
	public void insertCard(){
		atmState.insertCard();
	}
	
	public void ejectCard(){
		atmState.ejectCard();
	}
	
	public void requestCash(int cashToWithdraw){
		atmState.requestCash(cashToWithdraw);
	}
	
	public void insertPin(int pinEntered){
		atmState.insertPin(pinEntered);
	}

	/* --- getters for each of the states --- */
	public ATMState getYesCardState() { return hasCard; }
	public ATMState getNoCardState() { return noCard; }
	public ATMState getHasPin() { return hasCorrectPin; }
	public ATMState getNoCashState() { return atmOutOfMoney; }
	
}
