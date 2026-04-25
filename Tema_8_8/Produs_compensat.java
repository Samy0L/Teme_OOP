public class Produs_compensat extends Produs {
    private double coeficient;

    public Produs_compensat(String cod, String nume, double pret_de_baza, int cantitate, double coeficient){
        super(cod, nume, pret_de_baza, cantitate);
        this.coeficient = coeficient;
    }

    @Override
    public double calc_pret(){
        return pret_de_baza * coeficient;
    }

    public String toString(){
        return super.toString() + "\nPret: " +calc_pret();
    }

}
