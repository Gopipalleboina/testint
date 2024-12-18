//check whether a integer is a palindrome
import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int origina_n=n;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
          
            
        }
        //System.out.println("reverse number:"+ rev);
        if(origina_n==rev){
            System.out.println("palindrome:"+rev);
        }
        else{
            System.out.println("not palindrome:"+rev);
        }
      
    }
}
