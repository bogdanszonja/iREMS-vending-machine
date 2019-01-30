package com.codecool.vendingMachine;

public enum Coin {
	
	PENNY(1),
	NICKEL(5),
	DIME(10),
	QUARTER(25);
	
	private int value;
	
	private Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
}
