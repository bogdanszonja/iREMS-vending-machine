package main.com.codecool.vendingMachine;

import java.util.Map;
import java.util.HashMap;

public class VendingMachine {
	
	private Map<Coin, Integer> coinInventory = new HashMap<Coin, Integer>();
	
	public VendingMachine() {
		this.initialize();
	}

	private void initialize() {
		this.coinInventory.put(Coin.PENNY, 10);
		this.coinInventory.put(Coin.NICKEL, 10);
		this.coinInventory.put(Coin.DIME, 5);
		this.coinInventory.put(Coin.QUARTER, 5);	
	}

	public Map<Coin, Integer> getCoinInventory() {
		return this.coinInventory;
	}

	public Map<Product, Integer> getProductInventory() {
		// TODO Auto-generated method stub
		return null;
	}	

}