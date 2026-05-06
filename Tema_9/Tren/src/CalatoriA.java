public class CalatoriA extends Vagon{
    
    private static final int max_persoane = 40;
    private static final int max_colete = 300;

    private int pasageri;

    public CalatoriA(int colete, int pasageri){
        super(colete);
        if(pasageri>max_persoane){
            System.out.println("Prea multi pasageri!");
            this.pasageri = max_persoane;
        } else{
            this.pasageri = pasageri;
        }
        if(colete>max_colete){
            System.out.println("Prea multe colete!");
            colete = max_colete;
        } else{
            this.colete = colete;
        }
    }

    public int getCapacitateMaximaColete() {
        return max_colete;
    }

    public int getNrColete() {
        return colete;
    }

    public int getCapacitateMaximaPasageri() {
        return max_persoane;
    }

    public int getNrPasageri() {
        return pasageri;
    }

    public String getTip() {
        return "CalatoriA";
    }

    public void deschideUsi(){
        System.out.println("Usile se deschid automat.");
    }

    public void inchideUsi(){
        System.out.println("Usile se inchid automat.");
    }

}
