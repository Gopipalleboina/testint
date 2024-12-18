import java.util.*;
public class palindromestring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String st="";
        for(int i=(s.length()-1);i>=0;i--){
            st=st+s.charAt(i);
        }
        System.out.println(st);
        if(st.equals (s)){
            System.out.println("palindrome of a string");
        }
        else{
            System.out.println(" not palindrome of a string");
        }


    }

}
//another method
/*import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
   boolean ispalindrome=true; //we will give anything for it.it means true or false it   
  String s=sc.nextLine();
 int n=s.length();
 int mid=n/2;
 for(int i=0;i<mid;i++){
     if(s.charAt(i)!=s.charAt(n-i-1)){
         ispalindrome=false;
         break; ekkadithe adhi equal kadho akkada apesthundhi it will break completely go to next statement not continue for loop
     }
 }
  if(ispalindrome){
      System.out.println("palindrome");
  }
  else{
      System.out.println("not palindrome");
  }
    
    }
}*/