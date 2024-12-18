//remove all duplicates from a list
import java.util.*;
public class list{

    public static void main(String[] args){

        int[] ar={1,2,2,3,3,4};
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<ar.length;i++){
            int count=0;
            if(!h.contains(ar[i])){
            for(int j=0;j<ar.length;j++){
                if(i!=j){
                    if(ar[i]==ar[j]){
                       count++;
                    }
                    
                    
                }
            }
        
            if(count==0){
                System.out.println("non repeating:"+ar[i]);
            }
            else{
                 System.out.println("repeating:"+ar[i]);
            }
            h.add(ar[i]);
            }
     }
    }
    }
