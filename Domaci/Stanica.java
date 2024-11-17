package Domaci;

public class Stanica {
    private static int counter = 0;
    private int id;
    private Cenovnik cenovnik;
    private int naplacenePutarine = 0;
    private int naplacenoOdPostavkeCenovnika = 0;



    public Stanica(Cenovnik cenovnik){
        id = counter;
        counter++;
        this.cenovnik = cenovnik;
    }

    public void setCenovnik(Cenovnik cenovnik){
        this.cenovnik = cenovnik;
        System.out.println("Naplacene putarine od poslednjeg postavljanja cenovnika:" +this.naplacenoOdPostavkeCenovnika);
        this.naplacenoOdPostavkeCenovnika = 0;
    }

    public Stanica kopijaStanice(){
        return new Stanica(this.cenovnik);
    }

    public void naplatiPutarinu(Vozilo vozilo) throws RuntimeException{
        if(cenovnik == null){
            throw new NullPointerException("Cenovnik nije postavljen");
        }
        naplacenePutarine += this.cenovnik.getPutarina(vozilo.getCategory());
        int kategorija = vozilo.getCategory();
        naplacenoOdPostavkeCenovnika += this.cenovnik.getPutarina(kategorija);
    }

    @Override
    public String toString() {
        return "Naplacena putarina: " + this.naplacenePutarine + " , id: " + this.id;
    }
}
