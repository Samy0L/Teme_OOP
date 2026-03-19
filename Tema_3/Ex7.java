import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double ma = 0;
        int c = 0;
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
            c++;
        }
        ma = (double) s / c;
        System.out.println(String.format("%.2f", ma));
    }
}
