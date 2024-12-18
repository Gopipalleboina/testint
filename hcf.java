//Write a program to calculate HCF of Two given number.
import java.util.Scanner;
public class hcf{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a!=b){
            
            if(a>b){
                a=a-b;
                System.out.println("the value is:"+a);
                break;
            }
            if(b>a){
                b=b-a;
                System.out.println("the value is:"+b);
                break;
            }
        }
        System.out.print("hcf:"+a);
    }
}