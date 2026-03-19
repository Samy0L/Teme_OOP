public class Sertar {
    private int lungime;
    private int latime;
    private int inaltime;

    public Sertar(int lungime, int latime, int inaltime) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public void afisare() {
        System.out.println("Sertar: L=" + lungime + ", l=" + latime + ", h=" + inaltime);
    }
}
