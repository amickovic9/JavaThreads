package Domaci;

public class Cenovnik {
    public int[] putarine;

    public Cenovnik(int[] putarine){
        this.putarine = putarine;
    }

    public int brojKategorija() {
        return putarine.length;
    }

    public int getPutarina(int kategorija) throws IllegalArgumentException {
        if(kategorija < 1 || kategorija > putarine.length){
            throw new IllegalArgumentException("Pogresna kategorija");
        }
            return putarine[kategorija-1];
    }
}
