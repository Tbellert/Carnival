package Kermis.com.timo.attracties;
import Kermis.com.timo.attracties.Attractie;
import Kermis.com.timo.interfaces.GamblingAttraction;

public class Climbingladders extends Attractie implements GamblingAttraction {
	public void play() {
		System.out.println(this.getName() + " is spinning");
	}
	
	public void payGamblingTax() {
		System.out.println(getName() + " had a total revenue of: €" + cashRegister.getRevenue());
		double tax = cashRegister.getRevenue() * 0.3;
		System.out.println("Total tax (30% of revenue) will amount to: €" + tax);
		cashRegister.setRevenue(-tax);
	}
}
