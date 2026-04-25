public class Main {
    
    public static void main(String[] args) {
        Depozit depozit = new Depozit();

        Produs p1 = new Produs_compensat("6245", "Azitrox", 250, 10, 0.75);
        Produs p2 = new Produs_necompensat("0413", "Laptop", 4355, 8);
        Produs p3 = new Produs_compensat("123", "Paracetamol", 50, 5, 0.5);

        System.out.println(p1.calc_pret());
        System.out.println(p3.calc_pret());
        
        depozit.adauga_produs(p1);
        depozit.adauga_produs(p2);
        depozit.adauga_produs(p3);

        depozit.afiseazaInventar();
    }
    
}
