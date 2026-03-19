import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                s=s+i;
            }
        }
        System.out.println(s);     
    }
}
