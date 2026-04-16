public class Punct {
    private int x;
    private int y;

    public Punct(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "Coordonata X: " + x + "\nCoordonata Y: "+ y;
    }
    public static void main(String[] args) {
        PunctColorat pct1 = new PunctColorat(15, 25, "#79F8F8");
        System.out.println(pct1);
    }
}
