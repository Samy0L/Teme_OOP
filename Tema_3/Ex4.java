import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int min=1000000;
        if(a<min){
            min=a;
        }
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        System.out.println("Minimul e: " + min);     
    }
}
