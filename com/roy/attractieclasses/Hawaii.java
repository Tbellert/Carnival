package Kermis.com.roy.attractieclasses;

import Kermis.com.roy.exceptions.KaartjesExceptions;

public class Hawaii extends Attractie
{
	public Hawaii(String naam, double prijs, int oppervlakte, int draaiLimiet)
	{
		setNaam(naam);
		setPrijs(prijs);
		setOppervlakte(oppervlakte);
		setDraaiLimiet(draaiLimiet);
		opstellingsKeuring();
	}
	
	/***
	 * draaien() heeft een draaiLimiet voordat hij een onderhoudsbeurt nodig heeft.
	 */
	@Override
	public void draaien() throws KaartjesExceptions
	{
		if(getDraaiLimiet() > 0)
		{
			setDraaiLimiet(getDraaiLimiet() - 1);
			
			System.out.println("Draaien als Hawaii.");
			setOmzet(getOmzet() + getPrijs());
			setKaartjesVerkocht(getKaartjesVerkocht() + 1);
		}
		else
		{
			onderhoudsbeurt();
		}
		

		if(getKaartjesVerkocht() == 6)
		{
			setKaartjesVerkocht(6);
			throw new KaartjesExceptions(6);
		}
		else if(getKaartjesVerkocht() == 11)
		{
			throw new KaartjesExceptions(11);
		}
		
	}

	@Override
	public void opstellingsKeuring()
	{
		System.out.println("De Hawaii attractie is goedgekeurd.");
		System.out.println(" ");
	}
	
	public void onderhoudsbeurt()
	{
		System.out.println("Sorry, maar de " + this.getNaam() + " is tijdelijk gesloten voor een onderhoudsbeurt!");
		System.out.print("Fix..Fix..Fix..Fix..Fix..");
		System.out.println("Onderhoudsbeurt is klaar!");
		setDraaiLimiet(10);
	}
}
