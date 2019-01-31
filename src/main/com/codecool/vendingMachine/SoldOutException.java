package main.com.codecool.vendingMachine;

public class SoldOutException extends RuntimeException {

	public SoldOutException(String message) {
		super(message);
	}
}
