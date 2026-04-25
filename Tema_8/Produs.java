public class Produs {
    private String cod;
    private String nume;
    protected double pret_de_baza;
    private int cantitate;

    public Produs(String cod, String nume, double pret_de_baza, int cantitate){
        this.cod = cod;
        this.nume = nume;
        this.pret_de_baza = pret_de_baza;
        this.cantitate = cantitate;
    }

    public String afisare_cod(){
        return cod;
    }
    
    public int afiseaza_cantitate(){
        return cantitate;
    }
    
    public void adauga_cantitate(int cantitate){
        this.cantitate += cantitate;
    }

    public String toString(){
        return "Cod: " + cod + "\nNume: " + nume + "\nCantitate: " + cantitate;
    }
}
