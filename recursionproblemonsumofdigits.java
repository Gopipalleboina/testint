
import java.util.*;
public class recursionproblemonsumofdigits {
    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10+sumofdigits(n/10);
        }
    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int result=sumofdigits(n);
         System.out.println(result+" ");
    }
    }
    

