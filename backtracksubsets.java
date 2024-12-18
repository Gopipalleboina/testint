import java.util.*;
public class backtracksubsets{
    static ArrayList<ArrayList<Integer>>subsets(int[] num){
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>templist=new ArrayList<>();
        backtrack(templist,res,num,0);
        return res;
    }
    static void backtrack(ArrayList<Integer>templist,ArrayList<ArrayList<Integer>>res,int[] num,int st){
        res.add(new ArrayList<>(templist));
        for(int i=st;i<num.length;i++){
            templist.add(num[i]);
            backtrack(templist,res,num,i+1);
            templist.remove(templist.size()-1);
        }
    }
    public static void main(String[] args){
        int[] num={1,2,3};
        ArrayList<ArrayList<Integer>>subsets=subsets(num);
        System.out.println(subsets);
    }
}