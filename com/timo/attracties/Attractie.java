package Kermis.com.timo.attracties;
import java.util.Scanner;

import Kermis.com.timo.central.CashRegister;
import Kermis.com.timo.exceptions.MaintenanceException;

public abstract class Attractie {
	private String name;
	private double price;
	private double surfaceArea;
	private int limit;

	public CashRegister cashRegister = new CashRegister();
		
	public abstract void play() throws MaintenanceException;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}
	
	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit += limit;
	}
}
