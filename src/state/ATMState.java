package state;

/**
 * <h1>ATMState : interface</h1>
 * + insertCard() : void <br>
 * + ejectCard() : void <br>
 * + insertPin(int) : void <br>
 * + rejectCash(int) : void
 * <br>
 * <p>
 * These methods represent the <b>actions</b> a given user can perform on a ATM.<br>
 * A given action may change the <b>state</b> of the ATM.<br>
 * <b>NOTE: </b> every action must implement this interface and override these states
 * </p>
 * 
 **/

public interface ATMState {
	
	void insertCard();
	void ejectCard();
	void insertPin(int pinEntered);
	void requestCash(int cashToWithdraw);
	
	
	
}