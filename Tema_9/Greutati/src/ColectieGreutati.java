public class ColectieGreutati {

    private Greutate[] greutati;
    private int nr_greutati;

    public ColectieGreutati(int capacitateMaxima) {

        greutati = new Greutate[capacitateMaxima];
        nr_greutati = 0;
    }

    public void adauga(Greutate g) {

        if(nr_greutati < greutati.length) {

            greutati[nr_greutati] = g;
            nr_greutati++;

        } else {
            System.out.println("Colectia este plina!");
        }
    }

    public double medie() {

        if(nr_greutati == 0) {
            return 0;
        }

        int s = 0;

        for(int i = 0; i < nr_greutati; i++) {
            s += greutati[i].capacitate();
        }

        return (double)s / nr_greutati;
    }
    
}
