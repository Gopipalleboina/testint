import java.util.*;
public class anagrams{
    public static void main(String[] args){
        String s="rrr";
        String s1="RRR";
        s= s.toLowerCase();
       s1= s1.toLowerCase();
        if(s.length()!=s1.length()){
            System.out.println("strings are not anagrams");
        }
        else{
            char[] a=s.toCharArray();
            char[] b=s1.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)){
                System.out.println("they are anagrams");
            }
            else{
                 System.out.println("they are not anagrams");
            }
           /* An anagram is when you take a word and rearrange its letters to form another word. For example, "listen" and "silent" are anagrams because they use the same letters but in a different order.*/
        }
    }
}