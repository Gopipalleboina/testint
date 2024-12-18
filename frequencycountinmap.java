import java.util.*;
public class frequencycountinmap {
    public static void main(String[] args){
        int[] ar={1,2,2,3,3,4};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:ar){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.print(hm+" ");

    }
    
}
