public abstract class Vagon {
    
    protected int colete;

    public Vagon(int colete){
        this.colete = colete;
    }

    public int getColete() {
        return colete;
    }

    public void setColete(int colete) {
        this.colete = colete;
    }

    public abstract int getCapacitateMaximaColete();

    public abstract int getNrColete();

    public abstract int getCapacitateMaximaPasageri();

    public abstract int getNrPasageri();

    public abstract String getTip();
    
}
