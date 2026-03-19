public class Birou {
    private int lungime;
    private int latime;
    private int inaltime;
    private Sertar sertar1;
    private Sertar sertar2;

    public Birou(int lungime, int latime, int inaltime, Sertar sertar1, Sertar sertar2) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.sertar1=sertar1;
        this.sertar2=sertar2;
    }

    public void afisare() {
        System.out.println("Birou: L=" + lungime + ", l=" + latime + ", h=" + inaltime);
        sertar1.afisare();
        sertar2.afisare();
    }

}
