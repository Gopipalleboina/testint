import java.util.Scanner;
public class gcdandlcm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int original_a=a,original_b=b;
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        int lcm=(original_a*original_b)/b;
        System.out.println("the value of gcd is:"+b);
         System.out.println("the value of lcm is:"+lcm);
    }
}