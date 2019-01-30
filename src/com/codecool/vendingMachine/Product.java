package com.codecool.vendingMachine;

/**
 * Products supported by the vending machine.
 * @author Szonja Bogdán
 *
 */
public enum Product {

	COKE("coke", 25),
	PEPSI("pepsi", 35),
	SODA("soda", 45);
	
	private final String name;
	private final int price;
	
	private Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
}