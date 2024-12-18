import java.util.*;
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println(list+" ");
       /*  for(String e:list){
            System.out.println(e+" ");
        }*/
        list.add(1,"Blueberry");//adding elements through the indexes
        System.out.println(list);
        //accessing elements
        String fruit=list.get(2);
        System.out.println(fruit+" ");
        //modifying elemnts
         list.set(2,"blackberry");
         System.out.println(list+" ");
         //remove the elemnts
         list.remove(1);
         //contains()
         boolean b=list.contains("Apple");
         //index find out
         int index=list.indexOf("cherry");
         //is empty
         boolean isempty=list.isEmpty();
         System.out.println(list);
         int i=list.indexOf("cherry");
         System.out.println(i);
         list.clear();
         System.out.println(list);
    }
    
}
