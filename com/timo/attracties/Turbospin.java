package Kermis.com.timo.attracties;
import java.util.Scanner;

import Kermis.com.timo.exceptions.MaintenanceException;

public class Turbospin extends RiskAttraction {
	Scanner scanner = new Scanner(System.in);
	
	public void play() throws MaintenanceException {
		if (getLimit() > 0) {
			System.out.println(this.getName() + " is spinning");
			this.setLimit(-1);
		} else if (getLimit() == 0) {
			new MaintenanceException();
			setUpInspection();
		}
	}

	void setUpInspection() throws MaintenanceException {
		System.out.println("MAINTENANCE AND INSPECTION!");
		System.out.println("Inspector wallace grabs his checklist...");
		System.out.println("The carnival manager starts sweating profusifly. Will the attraction make it through inspection?");
		System.out.println(this.getName() + " has multiple safety hazards.");
		System.out.println("Press 'm' to send a mechanic for repairs, press 's' to skip.");
		String input = scanner.next();
		if (input.toLowerCase().equals("m")) {
			System.out.println("*FIXING SOUNDS*");
			System.out.println("APPROVED! (Although extra insurance might be a good idea).");
			this.setLimit(4);
		} else if (input.toLowerCase().equals("s")) {
			System.out.println("Attraction will remain broken");
			throw new MaintenanceException();
		}
	}
}
