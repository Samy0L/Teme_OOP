public class Carte {
    private int nr_pagini;

    public Carte(int nr_pagini){
        this.nr_pagini=nr_pagini;
    }

    public boolean comparareCarti(Carte altaCarte){
        return this.nr_pagini == altaCarte.nr_pagini;
    }

    public static void main(String[] args) {
        Carte c1 = new Carte(150);
        Carte c2 = new Carte(150);
        Carte c3 = new Carte(670);
        Carte c4 = new Carte(540);
        if(c1.comparareCarti(c2)){
            System.out.println("Cartile sunt identice");
        }else{
            System.out.println("Cartile nu sunt identice");
        }
        if(c3.comparareCarti(c4)){
            System.out.println("Cartile sunt identice");
        }else{
            System.out.println("Cartile nu sunt identice");
        }

    }
}
