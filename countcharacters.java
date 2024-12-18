//finding alphabets and spaces,special symbols
import java.util.Scanner;
class countcharacters {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the string:");
       String s=sc.nextLine();
       char a[]=s.toCharArray();// ichhina string avi alphabets leka special symbols ani kanipettali kabatti tocharArray method dwara characters la convert chesi array lo store chesamu.
       int alphabets=0;
       int numbers=0;
       int other=0;
       int spaces=0;
      //each and every character ni read cheyyadaniki for loop use chestham a ane array nuchi 
       for(int i=0;i<a.length;i++){
           if(Character.isLetter(a[i])){
               alphabets++;
       }
       else if(Character.isDigit(a[i])){
           numbers++;
       }
       else if(Character.isSpaceChar(a[i])){
           spaces++;
           
       }
       else{
           other++;
       }
       }
       System.out.println("alphabets:"+alphabets);
       System.out.println("numbers:"+numbers);
       System.out.println("spaces:"+spaces);
       System.out.println("specialcharacter:"+other);
    
}
}