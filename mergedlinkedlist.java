import java.util.*;
public class mergedlinkedlist {
    public static void main(String[] args){
        LinkedList<Integer>l=new LinkedList<>();
        Collections.addAll(l,1,2,3,4,5);
        Collections.reverse(l);
        System.out.println(l);
        LinkedList<Integer>ll=new LinkedList<>();//merged two linkedlist
        Collections.addAll(ll,1,3,5);
        LinkedList<Integer>lll=new LinkedList<>();
        Collections.addAll(lll,2,4,6);
        LinkedList<Integer>mer=new LinkedList<>();
        mer.addAll(ll);
        mer.addAll(lll);
        Collections.sort(mer);
        System.out.println(mer);
        for(int x:mer){
            System.out.println(x+" ");
        }

    }
    
}
