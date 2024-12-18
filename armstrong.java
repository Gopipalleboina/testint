//check whether the given number is armstrong
import java.util.*;
public class armstrong{
    public static void main(String[] args){
      int n=370;
      int r=n;
      int sum=0;
      int digits=0;
      int temp=n;
      while(temp>0){
          digits++;
          temp/=10;
      }
      while(n>0){
          int dig=n%10;
          sum=sum+(int)Math.pow(dig,digits);
          n=n/10;
          
      }
      if(sum==r){
          System.out.println("armstrong");
      }
      else{
           System.out.println("not armstrong");
      }
    }
}