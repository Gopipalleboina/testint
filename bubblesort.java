import java.util.*;
public class bubblesort{
    static void bubblesort(int[] ar){
        Scanner sc=new Scanner(System.in);
         int n=ar.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(ar[j] > ar[j+1]){
            int temp=ar[j];
            ar[j]=ar[j+1];
            ar[j+1]=temp;
                }
            }
        }
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int[] ar=new int[n];
     
      for(int i=0;i<ar.length;i++){
          ar[i]=sc.nextInt();
      }
      bubblesort(ar);
      System.out.println(Arrays.toString(ar));
      
    }
}