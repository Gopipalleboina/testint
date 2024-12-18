import java.util.*;
public class duplicatesonhashset {
    public static void main(String[] args){
        int[] arr={1,2,2,3,4,5,5};
        HashSet<Integer>h=new HashSet<>();
       
        for(int ele:arr){
            if(!h.add(ele)){
                System.out.println("duplicates found"+ele);
            }
            else{
                    System.out.println("no duplicates");
                }
               
             }
       



        HashSet<Integer>s=new HashSet<>();//prints common elements in one set
        HashSet<Integer>s1=new HashSet<>();
        Collections.addAll(s,1,2,3,4,5);
        Collections.addAll(s1,4,5,6,7,8);
        s.retainAll(s1);
        System.out.print(s);
    }
    
}
