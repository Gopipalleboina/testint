//factorial of a number
import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=1;
        for(int i=2;i<=n;i++){
            ans=ans*i;
        }
        System.out.println(ans);
    }
}