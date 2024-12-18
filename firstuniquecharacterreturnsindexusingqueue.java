import java.util.*;
public class  firstuniquecharacterreturnsindexusingqueue{
    static int firstuniquecharacter(String s){
        HashMap<Character,Integer>hm=new HashMap<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
            q.add(i);
        }
        while(!(q.isEmpty())){
            int index=q.peek();
            if(hm.get(s.charAt(index))==1){
                System.out.println("unique character:"+s.charAt(index));
                return index;
            }
            q.poll();
        }
        return -1;
    }
   public static void main(String[] args){
       String s="loveleetcode";
       int index=firstuniquecharacter(s);
       if(index!=-1){
        System.out.print("index:"+index);
    }
    else{
        System.out.println("no character found");
    }
       
   }
}