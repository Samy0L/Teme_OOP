import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex_4 {
    
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();

        Double[][] a = new Double[n][m];
        Double[][] b = new Double[m][p];
        Double[][] c = new Double[n][p];

        System.out.println("Matricea a:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Matricea b:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                c[i][j] = 0.0;

                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("rezultat.txt"))) {

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < p; j++) {
                    bw.write(c[i][j] + " ");
                }
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
        scanner.close();
    }
}
