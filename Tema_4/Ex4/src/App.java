public class App {
    public static void main(String[] args) throws Exception {
        Sertar ser1 = new Sertar(20, 10, 5);
        Sertar ser2 = new Sertar(22, 12, 6);
        Birou bir =new Birou(100, 50, 75, ser1, ser2);
        bir.afisare();
    }
}
