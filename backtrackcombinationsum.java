import java.util.*;
public class backtrackcombinationsum{
    static ArrayList<ArrayList<Integer>>combinationsum(int[] num,int tar){
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>templist=new ArrayList<>();
        backtrack(templist,res,num,tar,0);
        return res;
    }
    static void backtrack(ArrayList<Integer>templist,ArrayList<ArrayList<Integer>>res,int[] num,int tar,int st){
       if(tar <0) return;
       if(tar==0) res.add(new ArrayList<>(templist));
       
       else{
        for(int i=st;i<num.length;i++){
            templist.add(num[i]);
            backtrack(templist,res,num,tar-num[i],i+1);
            templist.remove(templist.size()-1);
        }
       }
       
    }
    public static void main(String[] args){
        int[] num={2,3,6,7};
        int tar=9;
        ArrayList<ArrayList<Integer>>results=combinationsum(num,tar);
        System.out.println(results);
    }
}