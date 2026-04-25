import java.util.*;

public class Depozit {

    private ArrayList<Produs> produse = new ArrayList<>();

    public void adauga_produs(Produs p) {
        for (Produs existent : produse) {
            if (existent.afisare_cod().equals(p.afisare_cod())) {
                existent.adauga_cantitate(p.afiseaza_cantitate());
                return;
            }
        }
        produse.add(p);
    }

    public void afiseazaInventar() {
        for (Produs p : produse) {
            System.out.println(p.toString());
            System.out.println("\n");
        }
    }

    

}
