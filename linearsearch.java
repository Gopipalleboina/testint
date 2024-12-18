import java.util.*;
public class linearsearch{
static int linearsearch(int[] ar){
     int tar=13;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==tar){
                return i;
            }
        }
            return -1;
        
}
     public static void main(String[] args){
        int[] ar={8,2,9,1,3};
       
       int res = linearsearch(ar);
       if(res!=-1){
           System.out.println("index found "+res);
       }
       else{
           System.out.println("index not found "); 
       }
   
        System.out.print(Arrays.toString(ar));
    }
}