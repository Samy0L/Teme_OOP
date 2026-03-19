import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int uc=0;
        int max=-1;
        while(n!=0){
            uc = n%10;
            if(uc>max){
                max=uc;
            }
            n=n/10;
        }
        System.out.print("Maximul este: " + max); 
    }
}
