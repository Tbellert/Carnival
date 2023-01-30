package Kermis.com.roy.exceptions;

public class KaartjesExceptions extends Exception
{
	public KaartjesExceptions(int k)
	{
		System.out.println("Kaartje: " + k + ", is net verkocht.");
	}
}
