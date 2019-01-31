package main.com.codecool.vendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {

	private Map<T, Integer> inventory = new HashMap<T, Integer>();
	
	public void add(T item) {
		int count = this.inventory.get(item);
		this.inventory.put(item, count + 1);
	}
	
	public void remove(T item) {
		int count = this.inventory.get(item);
		this.inventory.put(item, count - 1);
	}
	
	public boolean hasItem(T item) {
		return this.inventory.containsKey(item) ? true : false;
	}
	
	public void putAmount(T item, int amount) {
		this.inventory.put(item, amount);
	}
	
	public Map<T, Integer> getInventory() {
		return this.inventory;
	}
}