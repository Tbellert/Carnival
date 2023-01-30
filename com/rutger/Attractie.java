package Kermis.com.rutger;

abstract class Attractie {
    private String name;
    private double price;
    private double surface;

    abstract void draaien();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }
}

class BumperCars extends Attractie {
    @Override
    void draaien() {
        System.out.println("De Botsauto's! Maak je klaar voor de rit!!");
    }
}

class Spin extends Attractie{

    @Override
    void draaien() {
        System.out.println("De com.rutger.Spin! Maak je klaar voor de rit!!");
    }
}

class MirrorPalace extends Attractie{

    @Override
    void draaien() {
        System.out.println("Het Spiegelpaleis! Maak je klaar voor de rit!!");
    }
}

class GhostHouse extends Attractie {

    @Override
    void draaien() {
        System.out.println("Het Spookhuis! Maak je klaar voor de rit!!");
    }
}

class Hawaii extends Attractie {

    @Override
    void draaien() {
        System.out.println("De com.rutger.Hawaii! Maak je klaar voor de rit!!");
    }
}

class LadderClimb extends Attractie {

    @Override
    void draaien() {
        System.out.println("Ladder klimmen! Maak je klaar voor de rit!!");
    }
}