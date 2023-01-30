package Kermis.com.roy.attractieclasses;

import Kermis.com.roy.interfaces.*;

public class Ladderklimmen extends Attractie implements GokAttractie
{
	private static double belasting;
		
	public double getBelasting()
	{
		return belasting;
	}
	
	public void setBelasting()
	{
		belasting = 0;
	}
	
	public Ladderklimmen(String naam, double prijs, int oppervlakte)
	{
		belasting = 0;
		setNaam(naam);
		setPrijs(prijs);
		setOppervlakte(oppervlakte);
	}
	

	@Override
	public void draaien()
	{
		System.out.println("Ik draai ondersteboven tijdens het ladderklimmen");
		setOmzet(getOmzet() + getPrijs());
		setKaartjesVerkocht(getKaartjesVerkocht() + 1);
	}
	
	public void kansSpelBelastingBetalen()
	{
		belasting = (getOmzet() / 100) * 30;
	}
}
