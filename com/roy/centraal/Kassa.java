package Kermis.com.roy.centraal;

import Kermis.com.roy.attractieclasses.*;

public class Kassa 
{

	Botsauto bots;
	Spin spin;
	Spiegelpaleis spiegel;
	Spookhuis spook;
	Hawaii hawaii;
	Ladderklimmen ladder;

	double omzetHeleKermis;
	double omzetPlaceHolder;
	int totaalAantalVerkochteKaartjes;
	int kaartjesBotsauto;
	int kaartjesSpin;
	int kaartjesSpiegelpaleis;
	int kaartjesSpookhuis;
	int kaartjesHawaii;
	int kaartjesLadderklimmen;
	public static int aantalKeerDatBelastingInspecteurIsLangsGeweest = 0;
	

	public Kassa(Botsauto bots, Spin spin, Spiegelpaleis spiegel, Spookhuis spook, Hawaii hawaii, Ladderklimmen ladder)
	{
		this.bots = bots;
		this.spin = spin;
		this.spiegel = spiegel;
		this.spook = spook;
		this.hawaii = hawaii;
		this.ladder = ladder;
	}
	
	/***
	 * Print het totaal omzet van alle Attracties.
	 */
	public void TotaalOmzetKermis()
	{
		omzetPlaceHolder += bots.getOmzet();
		omzetPlaceHolder += spin.getOmzet();
		omzetPlaceHolder += spiegel.getOmzet();
		omzetPlaceHolder += spook.getOmzet();
		omzetPlaceHolder += hawaii.getOmzet();
		omzetPlaceHolder += ladder.getOmzet();
		
		omzetHeleKermis = omzetPlaceHolder;
		omzetPlaceHolder = 0;
		
		System.out.println("De totaal omzet van de hele kermis is: " + omzetHeleKermis);
	}
	
	
	/***
	 * Print hoeveel kaartjes er zijn verkocht per Attractie.
	 */
	public void Kaartjes()
	{
		kaartjesBotsauto = bots.getKaartjesVerkocht();
		kaartjesSpin = spin.getKaartjesVerkocht();
		kaartjesSpiegelpaleis = spiegel.getKaartjesVerkocht();
		kaartjesSpookhuis = spook.getKaartjesVerkocht();
		kaartjesHawaii = hawaii.getKaartjesVerkocht();
		kaartjesLadderklimmen = ladder.getKaartjesVerkocht();
		
		totaalAantalVerkochteKaartjes = kaartjesBotsauto + kaartjesSpin + kaartjesSpiegelpaleis + kaartjesSpookhuis + kaartjesHawaii + kaartjesLadderklimmen;
		
		System.out.println("Verkochte kaartjes Botsautos: " + kaartjesBotsauto);
		System.out.println("Verkochte kaartjes Spin: " + kaartjesSpin);
		System.out.println("Verkochte kaartjes SpiegelPaleis: " + kaartjesSpiegelpaleis);
		System.out.println("Verkochte kaartjes Spookhuis: " + kaartjesSpookhuis);
		System.out.println("Verkochte kaartjes Hawaii: " + kaartjesHawaii);
		System.out.println("Verkochte kaartjes Ladderklimmen: " + kaartjesLadderklimmen);
		
		System.out.println("Totaal aantal verkochte kaartjes, over alle attracties: " + totaalAantalVerkochteKaartjes);
	}
	
}
