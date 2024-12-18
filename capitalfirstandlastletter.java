import java.util.Scanner;
public class capitalfirstandlastletter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.nextLine();
        char a=Character.toUpperCase(s.charAt(0));
        char b=Character.toUpperCase(s.charAt(s.length()-1));
         System.out.print(a);
 for (int i = 1; i < s.length()-1 ; i++) {//prints remaining characters in the string
            System.out.print(s.charAt(i));
        }
 System.out.print(b);
    }
}
