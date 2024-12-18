import java.util.Scanner;
public class arraymaximumandminimum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
       System.out.println("enter the size of array:");
       int n=sc.nextInt();
       System.out.println("enter the elements:");
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
        int max=a[0];
        int min=a[0];
       
        for(int i=0;i<n;i++){
            if(max < a[i]){
                max=a[i];
              
            }
            if(min > a[i]){
                 min=a[i];
                  
            }
        }
         System.out.println("maximum number:"+max);
        System.out.println("minimum number:"+min);
       
    }
}