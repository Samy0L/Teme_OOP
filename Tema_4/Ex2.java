public class Ex2 {
    private int a;
    private char b;

    public void getInfo(){
        System.out.println("Valoarea int: " + a + ", valoarea char: " +b);
    }
    public static void main(String[] args) throws Exception {
        Ex2 test = new Ex2();
        test.getInfo();
    }
}
