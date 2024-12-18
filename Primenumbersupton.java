import java.util.*;
public class Primenumbersupton{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(" the prime numbers from 1 to"+n);
        for(int i=1;i<n;i++){
            boolean primenumbers=true;
            for(int j=2;j<i;j++){
            if(i%j==0){
                primenumbers=false;
                break;
            }
            }
            if(primenumbers){
                System.out.print(i+" ");
            }
        
    }
    }
}