import java.util.*;
public class balancedparanthesis{
    static boolean isvalid(String s){
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if((c==')' && top!='(') || (c=='}' && top!='{') || (c=='[' && top!=']')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        String s="{[()]}";
        boolean result=isvalid(s);
        if(result){
        System.out.println("balanced");
    }
    else{
         System.out.println("not balanced");
    }
    }
}