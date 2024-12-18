import java.util.Scanner;
class countthewordsinstrings {
    public static void main(String[] args) {
      System.out.print("enter the string:");
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();//welcome to java
       int count=1;
      for(int i=0;i<s.length()-1;i++){
          if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))//s.charAt(0): 'w' (not a space) i=8 in there is a space and i=9  is not space so, it counts 2
              {
              count++;
      }
      
      System.out.println("number of words in a string:"+count+s.charAt(i));
    }
      
    }
}