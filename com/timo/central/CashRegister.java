package Kermis.com.timo.central;

import java.util.ArrayList;

import Kermis.com.timo.attracties.Attractie;

public class CashRegister {
	private double revenue;
	private int ticketsSold;
	private TaxCollector taxCollector = new TaxCollector();
	public int taxCollected;

	private static double totalRevenue;
	private static int totalTicketsSold;
		
	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue += revenue;
		setTotalRevenue(revenue);
	}

	public int getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(int ticketsSold) {
		this.ticketsSold += ticketsSold;
		setTotalTicketsSold(ticketsSold);
	}

	public static double getTotalRevenue() {
		return totalRevenue;
	}

	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue += totalRevenue;
	}

	public static int getTotalTicketsSold() {
		return totalTicketsSold;
	}

	public void setTotalTicketsSold(int totalTicketsSold) {
		this.totalTicketsSold += totalTicketsSold;
	}
	
	public int getTaxCollected() {
		return taxCollected;
	}

	public void setTaxCollected(int taxCollected) {
		this.taxCollected += taxCollected;
	}
	
	public void giveLedger(ArrayList<Attractie> arrayList) {
		System.out.println("Financial worker: *Cowers in fear* and hands over ledger. ");
		taxCollector.collectTax(arrayList);
		setTaxCollected(1);
		System.out.println("Tax is collected " + getTaxCollected() + " times.");
		System.out.println(" ");
	}
	
}
