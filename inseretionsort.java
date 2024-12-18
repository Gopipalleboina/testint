import java.util.*;
public class inseretionsort{
    static void inseretionsort(int[] ar){
        int n=ar.length;
        for(int i=0;i<n;i++){
            int key=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=key;
        }
    }
    public static void main(String[] args){
        int[] ar={12,11,13,5,6};
        inseretionsort(ar);
        System.out.println(Arrays.toString(ar));
    }
}