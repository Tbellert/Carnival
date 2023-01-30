package Kermis.com.rutger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kermis.keuzeMenu();
    }
}

class Kermis {
    private String keuze;
    private boolean noChoice = false;

    Kermis() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Maak nu uw keuze:");
            keuze = sc.next();
            switch (keuze) {
                case "1":
                    BumperCars bumperCars = new BumperCars();
                    bumperCars.setName("De BotsAuto's");
                    bumperCars.setPrice(2.50);
                    bumperCars.setSurface(60.50);
                    bumperCars.draaien();
                    break;
                case "2":
                    Spin spin = new Spin();
                    spin.draaien();
                    break;
                case "3":
                    MirrorPalace spiegelhuis = new MirrorPalace();
                    spiegelhuis.draaien();
                    break;
                case "4":
                    GhostHouse spookHuis = new GhostHouse();
                    spookHuis.draaien();
                    break;
                case "5":
                    Hawaii hawaii = new Hawaii();
                    hawaii.draaien();
                    break;
                case "6":
                    LadderClimb ladderKlimmen = new LadderClimb();
                    ladderKlimmen.draaien();
                    break;
                case "o":
                    System.out.println("Omzet Block");
                    break;
                case "k":
                    System.out.println("Kaartjes Block");
                    break;
                case "m":
                    keuzeMenu();
                    break;
                case "q":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Heb je wel een optie uit het menu gekozen?");
                    noChoice = true;
            }
        } while (keuze.equals("1") || keuze.equals("2") || keuze.equals("3") || keuze.equals("4") || keuze.equals("5") || keuze.equals("6") || keuze.equals("o") || keuze.equals("k") || noChoice);
    }

    public static void keuzeMenu() {
        StringBuffer buf = new StringBuffer();
        buf.append("\n");
        buf.append("   Hallo en welkom op de com.rutger.Kermis!\n");
        buf.append("------------------------------------\n");
        buf.append("U kunt een keuze maken uit:\n");
        buf.append("1. De Botsauto's\n");
        buf.append("2. De com.rutger.Spin\n");
        buf.append("3. Het Spiegelpaleis\n");
        buf.append("4. Het Spookhuis\n");
        buf.append("5. De com.rutger.Hawaii\n");
        buf.append("6. Ladder Klimmen\n");
        buf.append("o voor de omzet\n");
        buf.append("k voor het aantal verkochte kaartjes\n");
        buf.append("m voor het keuze menu\n");
        buf.append("q for quit");
        System.out.println(buf);
        System.out.println("------------------------------------");

        new Kermis(); //Maar wil je wel elke keer een nieuwe kermis aanmaken?
    }
}
