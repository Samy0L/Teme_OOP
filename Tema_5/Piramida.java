public class Piramida {
    private int n;

    public Piramida(int n)
    {
        this.n = n;
    }

    public void tiparestePiramida(){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Piramida p1 = new Piramida(4);
        p1.tiparestePiramida();
    }
}
