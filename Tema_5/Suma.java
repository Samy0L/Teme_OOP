public class Suma {
    private int suma;

    public static int suma(int a, int b){
        return a+b;
    }
    public static int suma(int a, int b, int c){
        return suma(a, b)+c;
    }
    public static int suma(int a, int b, int c, int d)
    {
        return suma(a, b, c)+d;
    }

    public static void main(String[] args) {
        System.out.println(Suma.suma(642, 452));
        System.out.println(Suma.suma(642, 452, 43));
        System.out.println(Suma.suma(642, 452, 52, 64));
    }
}
