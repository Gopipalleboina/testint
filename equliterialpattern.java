import java.util.*;
public class equliterialpattern{
    public static void main(String[] args){
   int n=5;
       for(int i=1;i<=n;i++){
           for(int s=1;s<=n-i;s++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
       System.out.println("inverted equilateral triangle");
       for(int i=n;i>0;i--){
           for(int s=0;s<n-i;s++){
               System.out.print(" ");
           }
           for(int j=0;j<i;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
       
    
    }
}