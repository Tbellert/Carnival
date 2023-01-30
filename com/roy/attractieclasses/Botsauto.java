package Kermis.com.roy.attractieclasses;

public class Botsauto extends Attractie
{	
	public Botsauto(String naam, double prijs, int oppervlakte)
	{
		setNaam(naam);
		setPrijs(prijs);
		setOppervlakte(oppervlakte);
	}
	
	@Override
	public void draaien()
	{
		System.out.println("De bots auto's draaien!");
		setOmzet(getOmzet() + getPrijs());
		setKaartjesVerkocht(getKaartjesVerkocht() + 1);
	}
}
