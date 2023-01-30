package Kermis.com.roy;

import java.util.Scanner;
import Kermis.com.roy.attractieclasses.*;
import Kermis.com.roy.centraal.*;
import Kermis.com.roy.exceptions.KaartjesExceptions;

public class Applicatie 
{
	Botsauto bots = new Botsauto("Botsauto", 2.50d, 20);
	Spin spin = new Spin("Spin", 2.25d, 1, 5);
	Spiegelpaleis spiegel = new Spiegelpaleis("Spiegelpaleis", 2.75d, 50);
	Spookhuis spook = new Spookhuis("Spookhuis", 3.20d, 42);
	Hawaii hawaii = new Hawaii("Hawaii", 2.90d, 23, 10);
	Ladderklimmen ladder = new Ladderklimmen("Ladderklimmen", 5.0d, 1);
	
	Kassa kassa = new Kassa(bots, spin, spiegel, spook, hawaii, ladder);
	
	static String keuze;
	static boolean programRunning = true;
	
	static int rondjesVoorBelastingInspecteur = 0;
	
	
	public static void main(String[] args)
	{
		Applicatie app = new Applicatie();
		app.Herhaling();
		
		
	}
	
	
	/***
	 * Zorgt ervoor dat het programma open blijft, en zichzelf blijft herhalen.
	 */
	private void Herhaling()
	{
		Scanner scanner = new Scanner(System.in);
		
		while(programRunning)
		{
			if(rondjesVoorBelastingInspecteur >= 15)
			{
				BelastingInspecteur belastingInspecteur = new BelastingInspecteur(spin, ladder);
				Kassa.aantalKeerDatBelastingInspecteurIsLangsGeweest++;
				belastingInspecteur.CheckGokAttractie(bots, spin, spiegel, spook, hawaii, ladder);
				
				rondjesVoorBelastingInspecteur = 0;
			}
			
			
			Menu();
			keuze = scanner.next();
			Keuze(keuze);


			System.out.println(" ");
			System.out.println("=============================================================");
			System.out.println(" ");
			
			System.out.println("Wilt u nog een keuze maken? y/n");
			keuze = scanner.next().toLowerCase();
			if(keuze.equals("y"))
			{
				System.out.println(" ");
				System.out.println("=============================================================");
				System.out.println(" ");
			}
			else
			{
				System.out.println("Het programma is gestopt...");
				programRunning = false;
				System.exit(0);
			}
		}

	}
	
	
	/***
	 * Het hoofd Menu waarbij tekst wordt geschreven op het scherm, 
	 * om de gebruiker een keuze te geven.
	 */
	private static void Menu()
	{
		System.out.println("Maak een keuze:");
		System.out.println("");
		System.out.println("1: Botsauto's");
		System.out.println("2: Spin");
		System.out.println("3: Spiegelpaleis");
		System.out.println("4: Spookhuis");
		System.out.println("5: Hawaii");
		System.out.println("6: Ladderklimmen");
		System.out.println("O: Totaal omzet hele kermis.");
		System.out.println("k: Aantal verkochte kaartjes per attractie, en totaal");
		System.out.println("m: Monteur keurt en reset de attractie");
		System.out.println("Q: stopt het programma.");
		System.out.println("=============================================================");
	}
	
	
	/***
	 * Geeft de gebruiker de keuze wat zij willen gaan doen.
	 * @param keuze
	 */
	private void Keuze(String keuze)
	{
		try
		{
			switch(keuze.toLowerCase())
			{
				case "1":
					bots.draaien();
					break;
				case "2":
					spin.draaien();
					break;
				case "3":
					spiegel.draaien();
					break;
				case "4":
					spook.draaien();
					break;
				case "5":
					hawaii.draaien();
					break;
				case "6":
					ladder.draaien();
					break;
				case "o":
					kassa.TotaalOmzetKermis();
					break;
				case "k":
					kassa.Kaartjes();
					break;
				case "m":
					System.out.println("De monteur gaat zijn keuring doen.");
					spin.onderhoudsbeurt();
					hawaii.onderhoudsbeurt();
					break;
				case "q":
					System.out.println("Het programma is gestopt...");
					System.exit(0);
					break;
				default:
					System.out.println("Weet u zeker dat u de juiste invoer opgeeft?");
					break;
			}
		}
		catch(KaartjesExceptions e)
		{
			System.out.println(e);
		}
		
		rondjesVoorBelastingInspecteur++;

	}
}
