
import java.util.*;
public class arraylisttoarray {
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<>();
        list.add("cherry");
        list.add("apple");
        list.add("banana");
        String[] array=new String[list.size()];
        array=list.toArray(array);
        for(String x:array){
        System.out.println(x+" ");
    }
   /*ArrayList<Integer>l=new ArrayList<>();
Collections.addAll(list,1,2,3,4,5);
int[] ar=new int[list.size()];
for(int i=0;i<list.size();i++){
    ar[i]=list.get(i);
}*/

    
}
}
