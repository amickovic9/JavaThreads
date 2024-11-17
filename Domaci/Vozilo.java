package Domaci;

public class Vozilo implements Kategorizovano {
    private int kategorija;

    public Vozilo(int kategorija){
        this.kategorija = kategorija;
    }

    @Override
    public int getCategory() {
        return this.kategorija;
    }
}
