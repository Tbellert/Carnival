package Kermis.com.timo;
import java.util.ArrayList;
import java.util.Scanner;

import Kermis.com.timo.central.*;
import Kermis.com.timo.exceptions.*;

public class Main {
	static Scanner input = new Scanner(System.in);
	static boolean isRunning = true;
	static int taxCollectionRound = 0;
	Kermis kermis = new Kermis();

	public static void main(String[] args) {
		Main main = new Main();
		main.startMenu();
	}
	
	public void startMenu() {
		while (isRunning) {
			if (taxCollectionRound == 15) {
				kermis.sendInTheShark(kermis.AttractionsArray);
				taxCollectionRound = 0;
			}
			System.out.println("What would you like to do?");
			System.out.println("1 | Go to the carnival");
			System.out.println("2 | Staff only");
			System.out.println("3 | Leave carnival");
			String menuChoice = input.next();
			
			switch (menuChoice.toLowerCase()) {
			case "1":
				kermis.menu();
				break;
			case "2": 
				kermis.backEnd();
				break;
			case "3": 
				System.out.println("Thank you for your visit!");
				isRunning = false;
				System.exit(0);
				break;
			default:
				System.out.println("It looks like you failed to press a number simpleton.");
				System.out.println("Try again.");
				break;
			}
		}
	}
}