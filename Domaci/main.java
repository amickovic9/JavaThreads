package Domaci;

public class main {
    public static void main(String[] args) {
        int[] putarine = {100, 200, 300};
        Cenovnik osnovniCenovnik = new Cenovnik(putarine);

        Stanica osnovnaStanica = new Stanica(osnovniCenovnik);

        NaplatnaRampa rampa = new NaplatnaRampa("Stari Hrast", 3, osnovnaStanica, 2.0);
        Cenovnik noviCenovnik = new Cenovnik(new int[]{150, 250, 350});
        rampa.otvori(noviCenovnik);

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Nakon 15 sekundi: " + rampa);

        rampa.zatvori();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Stanje nakon zatvaranja: " + rampa);

        rampa.unisti();
        System.out.println("Rampa unistena.");
    }
}
