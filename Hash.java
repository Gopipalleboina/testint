import java.util.*;
public class Hash {
    public static void main(String[] args){
        HashMap<Integer,Character>h=new HashMap<>();
        h.put(1,'a');
        h.put(2,'b');
        h.put(3,'c');
        System.out.println(h.get(1));
        for(int k:h.keySet()){
            System.out.print(k+":"+h.get(k)+" ");
        }
        h.remove(2);
        for(int k:h.keySet()){
            System.out.print(k+":"+h.get(k)+" ");
        }
    }
    
}
