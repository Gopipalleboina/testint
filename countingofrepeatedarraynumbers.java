import java.util.Scanner;
public class countingofrepeatedarraynumbers{
    public static void main(String[] args){
       int arr[]={1,2,3,4,2,2};
       int n=2;
       int count=0;
       for(int i=0;i<arr.length;i++){
           if(n==arr[i]){
               count++;
           }
       }
       System.out.println("the number of times:"+count);
       
    }
}
        