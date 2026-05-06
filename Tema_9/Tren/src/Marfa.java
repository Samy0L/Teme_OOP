public class Marfa extends Vagon{
    
    private static final int max_colete = 400;

    public Marfa(int colete){
        super(colete);
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
        return 0;
    }

    public int getNrPasageri() {
        return 0;
    }
    
    public String getTip() {
        return "Marfa";
    }

}
