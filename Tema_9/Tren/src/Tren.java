public class Tren {
 
    private Vagon[] vagoane;

    public Tren(Vagon[] vagoane){
        if(vagoane.length > 15){
            System.out.println("Un tren poate avea maxim 15 vagoane!");
            this.vagoane = new Vagon[15];

            for(int i=0; i<15; i++){
                this.vagoane[i] = vagoane[i];
            }
        }else {
            this.vagoane = vagoane;
        }
    }

    public int getTotalColete() {
        int capacitate_maxima_colete = 0;

        for (Vagon v : vagoane) {
            capacitate_maxima_colete += v.getCapacitateMaximaColete();
        }
        return capacitate_maxima_colete;
    }

    public int getNumarColete(){
        int numar_colete = 0;

        for (Vagon v : vagoane) {
            numar_colete += v.getNrColete();
        }
        return numar_colete;
    }



    public int getTotalPasageri() {
        int capacitate_maxima_pasageri = 0;

        for (Vagon v : vagoane) {
            capacitate_maxima_pasageri += v.getCapacitateMaximaPasageri();
        }
        return capacitate_maxima_pasageri;
    }

    public int getNumarPasageri(){
        int numar_pasageri = 0;

        for (Vagon v : vagoane) {
            numar_pasageri += v.getNrPasageri();
        }
        return numar_pasageri;
    }


    public boolean esteEgalCu(Tren altTren) {
        return this.getTotalColete() == altTren.getTotalColete();
    }

    public void afiseazaTipVagon() {
        for (Vagon v : vagoane) {
            System.out.println(v.getTip());
        }
    }

    public static void main(String[] args) {
        CalatoriA vagon1 = new CalatoriA(265, 35);
        CalatoriB vagon2 = new CalatoriB(352, 43);
        Marfa vagon3 = new Marfa(393);
        Vagon[] vagoane = {vagon1, vagon2, vagon3};
        Tren tren = new Tren(vagoane);
        tren.afiseazaTipVagon();

        System.out.println("Capacitate maxima pasageri: " + tren.getTotalPasageri());
        System.out.println("Numar pasageri: " + tren.getNumarPasageri());
        System.out.println("Capacitate maxima colete: " + tren.getTotalColete());
        System.out.println("Numar colete: " + tren.getNumarColete());
    }

}
