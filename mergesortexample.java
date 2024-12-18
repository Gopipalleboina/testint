import java.util.*;
public class mergesortexample{
    static void merge(int[] ar,int l, int mid, int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] leftarray=new int[n1];
        int[] rightarray=new int[n2];
        for(int i=0;i<n1;i++){
            leftarray[i]=ar[l+i];
        }
        for(int j=0;j<n2;j++){
            rightarray[j]=ar[mid+1+j];
        }
        int i=0;
        int j=0,k=l;
        while(i<n1 && j<n2){
            if(leftarray[i] < rightarray[j]){
                ar[k]=leftarray[i];
                i++;
            }
            else{
                ar[k]=rightarray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            
                ar[k]=leftarray[i];
                i++;
                k++;
            }
           while(j<n2){
                 ar[k]=rightarray[j];
                j++;
                k++;
            }
        
    }
    
    
    
    static void mergesort(int[] ar, int l, int r){
        if(l<r){
        int mid=l+(r-l)/2;
        mergesort(ar,l,mid);
        mergesort(ar,mid+1,r);
        merge(ar,l,mid,r);
        } 
    }
    public static void main(String[] args){
        int[] ar={12,11,13,5,6,7};
        System.out.println("given array:"+Arrays.toString(ar));
        mergesort(ar,0,ar.length-1);
          System.out.println("sorted  array:"+Arrays.toString(ar));
    }
}