import java.util.*;
public class Medianofarraylist{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>l=new ArrayList<>();
        ArrayList<Integer>s=new ArrayList<>();
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            l.add(ele);
        }
        int m=sc.nextInt();
        for(int j=0;j<m;j++){
            int p=sc.nextInt();
            s.add(p);
        }
        ArrayList<Integer>mer=new ArrayList<>();
        mer.addAll(l);
        mer.addAll(s);
       System.out.println(mer+" ");
     /*  double median;
        int size = mer.size();
        if (size % 2 == 0) {
            // Even number of elements
            median = (mer.get(size / 2 - 1) + mer.get(size / 2)) / 2.0;
        } else {
            // Odd number of elements
            median = mer.get(size / 2);
        }*/
        double median=(mer.get(1)+mer.get(2))/2.0;
        System.out.println(median+" ");

       
    }
}