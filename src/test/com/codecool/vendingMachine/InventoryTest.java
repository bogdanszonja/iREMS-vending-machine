package test.com.codecool.vendingMachine;

import main.com.codecool.vendingMachine.Inventory;
import main.com.codecool.vendingMachine.Coin;
import main.com.codecool.vendingMachine.Product;

import java.util.Map;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryTest<T> {
	
	private Inventory<Coin> coinInventory = new Inventory<Coin>();
	private Inventory<Product> productInventory = new Inventory<Product>();
	
	@BeforeEach
	void setup() {
		this.coinInventory = new Inventory<Coin>();
		this.productInventory = new Inventory<Product>();
		
		this.coinInventory.putAmount(Coin.PENNY, 10);
		this.coinInventory.putAmount(Coin.NICKEL, 10);
		this.coinInventory.putAmount(Coin.DIME, 5);
		this.coinInventory.putAmount(Coin.QUARTER, 5);
		
		this.productInventory.putAmount(Product.COKE, 15);
		this.productInventory.putAmount(Product.PEPSI, 15);
		this.productInventory.putAmount(Product.SODA, 15);
	}
	
	@Test
	void addCoinForInventory() {
		Map<Coin, Integer> expectedCoinInventory = new HashMap<Coin, Integer>();
		expectedCoinInventory.put(Coin.PENNY, 10);
		expectedCoinInventory.put(Coin.NICKEL, 10);
		expectedCoinInventory.put(Coin.DIME, 6);
		expectedCoinInventory.put(Coin.QUARTER, 5);
		
		this.coinInventory.add(Coin.DIME);
		Map<Coin, Integer> result = this.coinInventory.getInventory();
		
		assertEquals(expectedCoinInventory, result);
	}
	
	@Test
	void testAddProductsForInventory() {
		Map<Product, Integer> expectedProductInventory = new HashMap<Product, Integer>();
		expectedProductInventory.put(Product.COKE, 16);
		expectedProductInventory.put(Product.PEPSI, 15);
		expectedProductInventory.put(Product.SODA, 15);
		
		this.productInventory.add(Product.COKE);
		Map<Product, Integer> result = this.productInventory.getInventory();
		
		assertEquals(expectedProductInventory, result);
	}
	
	@Test
	void testRemoveCoinFromInventory() {
		Map<Coin, Integer> expectedCoinInventory = new HashMap<Coin, Integer>();
		expectedCoinInventory.put(Coin.PENNY, 9);
		expectedCoinInventory.put(Coin.NICKEL, 10);
		expectedCoinInventory.put(Coin.DIME, 5);
		expectedCoinInventory.put(Coin.QUARTER, 5);
		
		this.coinInventory.remove(Coin.PENNY);
		Map<Coin, Integer> result = this.coinInventory.getInventory();
		
		assertEquals(expectedCoinInventory, result);
	}

	@Test
	void testRemoveProductFromInventory() {
		Map<Product, Integer> expectedProductInventory = new HashMap<Product, Integer>();
		expectedProductInventory.put(Product.COKE, 15);
		expectedProductInventory.put(Product.PEPSI, 15);
		expectedProductInventory.put(Product.SODA, 14);
		
		this.productInventory.remove(Product.SODA);
		Map<Product, Integer> result = this.productInventory.getInventory();
		
		assertEquals(expectedProductInventory, result);
	}
	
	@Test
	void testHasCoinFalseIfNoCoinFound() {
		boolean expected = false;
		
		for (int i = 0; i < 7; i++) {
			this.coinInventory.remove(Coin.DIME);
		}
		boolean result = this.coinInventory.hasItem(Coin.DIME);
		
		assertEquals(expected, result);
	}

	@Test
	void testHasProductFalseIfNoProductFound() {
		boolean expected = false;
		
		for (int i = 0; i < 16; i++) {
			this.productInventory.remove(Product.COKE);
		}
		boolean result = this.productInventory.hasItem(Product.COKE);
		
		assertEquals(expected, result);
	}

}
