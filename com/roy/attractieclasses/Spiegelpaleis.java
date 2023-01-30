package Kermis.com.roy.attractieclasses;

public class Spiegelpaleis extends Attractie
{	
	public Spiegelpaleis(String naam, double prijs, int oppervlakte)
	{
		setNaam(naam);
		setPrijs(prijs);
		setOppervlakte(oppervlakte);
	}
	

	@Override
	public void draaien()
	{
		System.out.println("Wij draaien rond in het Spiegelpaleis");
		setOmzet(getOmzet() + getPrijs());
		setKaartjesVerkocht(getKaartjesVerkocht() + 1);
	}
}
