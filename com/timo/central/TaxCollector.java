package Kermis.com.timo.central;

import java.util.ArrayList;

import Kermis.com.timo.attracties.Attractie;
import Kermis.com.timo.interfaces.GamblingAttraction;

public class TaxCollector {
	public void collectTax(ArrayList<Attractie> arrayList) {
		System.out.println("Taxcollector Johnson opens up the carnival ledger and checks for the presence of gambling attractions.");
		for (Attractie i : arrayList) {
			try {
				if (i instanceof GamblingAttraction) {
					System.out.println(i.getName() + " appears to be a gambling attraction and must therefore, according to article 14 ehr, pay tax.");
					((GamblingAttraction) i).payGamblingTax();
					System.out.println(" ");
				} else {
					new Exception();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
