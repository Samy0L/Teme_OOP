import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int uc=0;
        while(n!=0){
            uc = n%10;
            n=n/10;
            System.out.print(uc+ " "); 
        }
    }
}
