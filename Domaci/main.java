package Domaci;

public class main {
    public static void main(String[] args) {
        int[] putarine = {100, 200, 300};

        Cenovnik cenovnik = new Cenovnik(putarine);

        Stanica stanica = new Stanica(cenovnik);

        Vozilo auto = new Vozilo(1);
        Vozilo kamion = new Vozilo(2);
        Vozilo autobus = new Vozilo(3);
        Vozilo pogresnoVozilo = new Vozilo(4);

        try {
            stanica.naplatiPutarinu(auto);
            stanica.naplatiPutarinu(kamion);
            System.out.println(stanica);
        } catch (Exception e) {
            System.out.println("Greška: " + e.getMessage());
        }

        try {
            stanica.naplatiPutarinu(pogresnoVozilo);
        } catch (IllegalArgumentException e) {
            System.out.println("Greška: " + e.getMessage());
        }

        int[] noviPutarine = {120, 220, 320};
        Cenovnik noviCenovnik = new Cenovnik(noviPutarine);
        stanica.setCenovnik(noviCenovnik);

        try {
            stanica.naplatiPutarinu(autobus);
            System.out.println(stanica);
        } catch (Exception e) {
            System.out.println("Greška: " + e.getMessage());
        }

        Stanica kopijaStanice = stanica.kopijaStanice();
        System.out.println("Kopija stanice: " + kopijaStanice);
    }
}
