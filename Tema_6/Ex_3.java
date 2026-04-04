import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu textul: ");
        String t = scanner.nextLine();
        System.out.println("Introdu numele fisierului: ");
        String nume_fisier = scanner.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(nume_fisier));

        String l;
        int c = 0;

        while ((l = br.readLine()) != null) {
            if (l.equals(t)) {
                c++;
            }
        }
        System.out.println("Numar de linii egale: " + c);
        br.close();
    }
}
