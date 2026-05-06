public class G_multipla extends Greutate {
    
    private Greutate[] greutati;
    private int nr_greutati;

    public G_multipla(int capacitateMaxima) {
        greutati = new Greutate[capacitateMaxima];
        nr_greutati = 0;
    }

    public void adauga(Greutate g) {

        if(nr_greutati < greutati.length) {
            greutati[nr_greutati] = g;
            nr_greutati++;
        } else {
            System.out.println("Greutate multipla plina!");
        }
    }

    @Override
    public int capacitate() {

        int s = 0;

        for(int i = 0; i < nr_greutati; i++) {
            s += greutati[i].capacitate();
        }

        return s;
    }

}
