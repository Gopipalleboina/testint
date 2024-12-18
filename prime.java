//check whether the given number is prime
import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
           
        }
         if(count==0){
            System.out.println(" it is   a prime number");
        } 
        else{
            System.out.println("it is not a prime number");
        }
        
    }
}