public class Produs_necompensat extends Produs {
    
    public Produs_necompensat(String cod, String nume, double pret_de_baza, int cantitate){
        super(cod, nume, pret_de_baza, cantitate);
    }

    @Override
    public double calc_pret(){
        return pret_de_baza;
    }

    public String toString(){
        return super.toString() + "\nPret: " +calc_pret();
    }

}
