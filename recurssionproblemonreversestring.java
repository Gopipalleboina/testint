import java.util.*;
public class recurssionproblemonreversestring {
    static String reverse(String s){
        if(s.isEmpty()){
            return s;
        }
        else{
            return reverse(s.substring(1))+s.charAt(0);
        }
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b=reverse(a);
      System.out.println(b);
    }

    }

    

