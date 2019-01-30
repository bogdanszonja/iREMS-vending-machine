package main.com.codecool.vendingMachine;

/**
 * Coins supported by the vending machine.
 * 
 * @author Szonja Bogdán
 *
 */
public enum Coin {

	PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

	private final int value;

	private Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

}