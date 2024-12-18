import java.util.*;
public class Problemsonarraylist {
    public static void main(String[] args){
        ArrayList<Integer>l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            l.add(ele);
        }
        for(int i=l.size()-1;i>=0;i--){  //reverse array
            System.out.print(l.get(i)+" ");
        }
        HashSet<Integer>h=new HashSet<>(l);//remove duplicates
        System.out.println(h);
        for(int k:h){
            System.out.println(k+" ");
        }

    }
    
}
