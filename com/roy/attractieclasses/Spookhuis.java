package Kermis.com.roy.attractieclasses;

public class Spookhuis extends Attractie
{
	public Spookhuis(String naam, double prijs, int oppervlakte)
	{
		setNaam(naam);
		setPrijs(prijs);
		setOppervlakte(oppervlakte);
	}
	

	@Override
	public void draaien()
	{
		System.out.println("De spook draait rond in zijn Spookhuis");
		setOmzet(getOmzet() + getPrijs());
		setKaartjesVerkocht(getKaartjesVerkocht() + 1);
	}
}
