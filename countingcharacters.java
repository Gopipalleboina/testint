import java.util.Scanner;
class countingcharacters {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the string:");
       String s=sc.nextLine();
       int arr[]=new int[256];
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);//collecting character
           int x=(int)ch;
           arr[x]++;// counts the int value it means 104 is one time and 105 is one time etc..
       }
       for(int i=0;i<256;i++){
          if(arr[i]!=0){
               System.out.println((char)i+":"+arr[i]);
           }
       }
    }
}