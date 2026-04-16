public class PunctColorat extends Punct {
    private String c;
 /* Trebuie sa facem un constructor extins in clasa PunctColorat, deoarece clasa PunctColorat mosteneste
 clasa Punct (si aceasta are constructor cu parametri), si asa vom putea primi in clasa mostenitoare valorile 
 atributelor x, y, iar apoi sa initializam pe c. */
    public PunctColorat(int x, int y, String c){
        super(x, y);
        this.c = c;
    }

    public String toString(){
        return super.toString() + "\nCodul culorii: " + c;
    }
}
