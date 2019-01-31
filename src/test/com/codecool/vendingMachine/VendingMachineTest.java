package test.com.codecool.vendingMachine;

import main.com.codecool.vendingMachine.VendingMachine;
import main.com.codecool.vendingMachine.Coin;
import main.com.codecool.vendingMachine.Product;

import java.util.Map;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {
	
	private VendingMachine vendingMachine;
	
	@BeforeEach
	void setup() {
		this.vendingMachine = new VendingMachine();
	}
	
	@Test
	void testInitializationForCoins() {
		Map<Coin, Integer> expectedCoinInventory = new HashMap<Coin, Integer>();
		expectedCoinInventory.put(Coin.PENNY, 10);
		expectedCoinInventory.put(Coin.NICKEL, 10);
		expectedCoinInventory.put(Coin.DIME, 5);
		expectedCoinInventory.put(Coin.QUARTER, 5);
		
		Map<Coin, Integer> result = this.vendingMachine.getCoinInventory();
		
		assertEquals(expectedCoinInventory, result);
	}
	
	@Test
	void testInitializationForProducts() {
		Map<Product, Integer> expectedProductInventory = new HashMap<Product, Integer>();
		expectedProductInventory.put(Product.COKE, 15);
		expectedProductInventory.put(Product.PEPSI, 15);
		expectedProductInventory.put(Product.SODA, 15);
		
		Map<Product, Integer> result = this.vendingMachine.getProductInventory();
		
		assertEquals(expectedProductInventory, result);
	}
	
	@Test
	void testGetPriceForSelectedProduct() {
		int expectedPrice = 45;
		
		int result = this.vendingMachine.getPriceForSelectedProduct(Product.SODA);
		
		assertEquals(expectedPrice, result);
	}
}
