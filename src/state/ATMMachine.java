package state;

/**
 * -- The context --
 **/

public class ATMMachine {
	
	ATMState atmState;
	
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	int cashInMachine = 2000;
	
	// { defaults to false }
	boolean correctPinEntered = false;
	
	public ATMMachine(){
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		
		atmState = noCard;
	
		if (cashInMachine < 0) {
			atmState = atmOutOfMoney;
		}
	}
	
	void setATMState(ATMState newATMState){
		atmState = newATMState;
	}
	
	public void setChashInMachine(int newCashInMachine){
		cashInMachine = newCashInMachine;
	}
	
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

	public ATMState getYesCardState() { return hasCard; }
	public ATMState getNoCardState() { return noCard; }
	public ATMState getHasPin() { return hasCorrectPin; }
	public ATMState getNoCashState() { return atmOutOfMoney; }
	
}
