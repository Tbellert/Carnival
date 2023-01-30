package Kermis.com.timo.attracties;

import Kermis.com.timo.exceptions.MaintenanceException;

abstract class RiskAttraction extends Attractie {
	public void play() throws MaintenanceException {
		System.out.println("This is a risk attraction");
	}
	abstract void setUpInspection() throws MaintenanceException;
}
