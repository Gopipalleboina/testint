import java.util.*;
public class permutationonbacktrack{
    static ArrayList<ArrayList<Integer>>permutation(int[] num){
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>templist=new ArrayList<>();
        backtrack(templist,res,num);
        return res;
    }
    static void backtrack (ArrayList<Integer>templist,ArrayList<ArrayList<Integer>>res,int[] num){
      if(templist.size()==num.length){
         res.add(new ArrayList<>(templist));
      }
        for(int i=0;i<num.length;i++){
            if(templist.contains(num[i]))  continue;
        templist.add(num[i]);
        backtrack(templist,res,num);
        templist.remove(templist.size()-1);
        } 
    
    }
    public static void main(String[] args){
        int[] num={2,3,6};
        
        ArrayList<ArrayList<Integer>>subsets=permutation(num);
        System.out.println(subsets);
    }
}