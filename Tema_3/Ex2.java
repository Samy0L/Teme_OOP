import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 1 || n > 5) {
            System.out.println("INVALID");
        }
        if (n == 1) {
            System.out.println("UNU");
        } else if (n == 2) {
            System.out.println("DOI");
        } else if (n == 3) {
            System.out.println("TREI");
        } else if (n == 4) {
            System.out.println("PATRU");
        } else if (n == 5) {
            System.out.println("CINCI");
        }
    }
}
