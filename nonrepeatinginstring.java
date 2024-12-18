import java.util.Scanner;
public class nonrepeatinginstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.nextLine();
      
      for(int i=0;i<s.length();i++){
          int count=0;// reset the count for each word
          for(int j=0;j<s.length();j++){
              if(s.charAt(i)==s.charAt(j)){
                  count++;
              }
          }
          if(count==1){//repeating kavalante count>1 use cheyyali condition lo
              System.out.println("non repeating character is:"+s.charAt(i));
              
              
          }
      }
    }
}
