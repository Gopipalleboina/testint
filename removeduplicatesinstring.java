//reverse string
import java.util.*;
public class removeduplicatesinstring{
    public static void main(String[] args){
        String s="engineering";
        String result="";
       HashSet<Character>h=new HashSet<>();
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           if((!(h.contains(c)))){
               h.add(c);
               result+=c;
           }
       }
       System.out.println(result);
    }
}