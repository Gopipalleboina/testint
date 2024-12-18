//left, right and pyramid star pattern problem
import java.util.Scanner;
class leftpattern {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
           for(int s=n-i;s>=1;s--){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println("");
       }
       
    }
}