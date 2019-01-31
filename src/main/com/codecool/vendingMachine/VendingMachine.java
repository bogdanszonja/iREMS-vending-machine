package main.com.codecool.vendingMachine;

import java.util.Map;

public class VendingMachine {
	
	private Inventory<Coin> coinInventory = new Inventory<Coin>();
	private Inventory<Product> productInventory = new Inventory<Product>();
	
	public VendingMachine() {
		this.initialize();
	}

	private void initialize() {
		this.coinInventory.putAmount(Coin.PENNY, 10);
		this.coinInventory.putAmount(Coin.NICKEL, 10);
		this.coinInventory.putAmount(Coin.DIME, 5);
		this.coinInventory.putAmount(Coin.QUARTER, 5);
		
		this.productInventory.putAmount(Product.COKE, 15);
		this.productInventory.putAmount(Product.PEPSI, 15);
		this.productInventory.putAmount(Product.SODA, 15);
	}

	public Map<Coin, Integer> getCoinInventory() {
		return this.coinInventory.getInventory();
	}

	public Map<Product, Integer> getProductInventory() {
		return this.productInventory.getInventory();
	}

}