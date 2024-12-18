import java.util.*;
class countofpairedarrays {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
       int sum=6,count=0;
      // System.out.println("the duplivate elements are:");
       for(int i=0;i<arr.length;i++){
           for(int j=1;j<arr.length;j++){
               if(arr[i]+arr[j]==sum){
                   count++;
          
               }
           }
       }
           System.out.println(count);
               
       
    }
}