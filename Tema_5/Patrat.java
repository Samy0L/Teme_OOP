public class Patrat {
    private int latura;

    public Patrat(int latura){
        this.latura = latura;
    }

    public Patrat(){
        this.latura= 10;
    }

    public void tipareste(){
        int aria = latura * latura;
        System.out.println("Patrat " + latura + " Aria " + aria);
    }

    public static void main(String[] args) {
        Patrat p1 = new Patrat(8);
        Patrat p2 = new Patrat();
        p1.tipareste();
        p2.tipareste();
    }
}
