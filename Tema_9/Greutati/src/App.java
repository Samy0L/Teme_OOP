public class App {
    
    public static void main(String[] args) {

        G_simpla g1 = new G_simpla(10);
        G_simpla g2 = new G_simpla(20);
        G_simpla g3 = new G_simpla(30);

        G_dubla gd1 = new G_dubla(g1, g2);

        G_multipla gm1 = new G_multipla(5);

        gm1.adauga(g1);
        gm1.adauga(gd1);
        gm1.adauga(g3);

        ColectieGreutati col = new ColectieGreutati(10);

        col.adauga(g1);
        col.adauga(g2);
        col.adauga(g3);
        col.adauga(gd1);
        col.adauga(gm1);

        System.out.println("Capacitate g1: " + g1.capacitate());
        System.out.println("Capacitate greutate dubla: " + gd1.capacitate());
        System.out.println("Capacitate greutate multipla: " + gm1.capacitate());

        System.out.println("Media colectiei: " + col.medie());
    
    }
}
