package Kermis.com.roy.centraal;

import Kermis.com.roy.attractieclasses.*;
import Kermis.com.roy.interfaces.*;

public class BelastingInspecteur 
{
	Botsauto bots;
	Spin spin;
	Spiegelpaleis spiegel;
	Spookhuis spook;
	Hawaii hawaii;
	Ladderklimmen ladder;
	
	double steelBelasting = 0;
	
	
	public BelastingInspecteur(Spin spin, Ladderklimmen ladder)
	{
		this.spin = spin;
		this.ladder = ladder;
		
		this.spin.kansSpelBelastingBetalen();
		this.ladder.kansSpelBelastingBetalen();
	}
	
	/***
	 * De BelastingInspecteur steelt het geld van de Attracties
	 */
	private void NeemtBelasting()
	{
		steelBelasting = ladder.getBelasting();
		steelBelasting += spin.getBelasting();
		
		System.out.println("Belasting: " + steelBelasting);
			
	}
	
	/***
	 * De BelastingInspecteur kijkt of er GokAttracties zijn
	 * @param bots
	 * @param spin
	 * @param spiegel
	 * @param spook
	 * @param hawaii
	 * @param ladder
	 */
	public void CheckGokAttractie(Botsauto bots, Spin spin, Spiegelpaleis spiegel, Spookhuis spook, Hawaii hawaii, Ladderklimmen ladder)
	{
		Attractie[] attracties = new Attractie[]{bots,spin,spiegel,spook,hawaii,ladder};
		
		for(Attractie a : attracties)
		{
			if(a instanceof GokAttractie)
			{
				NeemtBelasting();
			}
		}
		
		ResetBelasting();
		
	}
	
	private void ResetBelasting()
	{
		ladder.setBelasting();
		spin.setBelasting();
	}
}
