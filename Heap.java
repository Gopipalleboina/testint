import java.util.*;
public class Heap{
    void heapify(ArrayList<Integer>ht,int i){
        int size=ht.size();
        int lar=i;
        int l=2*i+1;
        int r=2*i+2;
        if((l<size) && ht.get(l)>ht.get(lar)){
            lar=l;
         }
         if((r<size) && ht.get(r)>ht.get(lar)){
             lar=r;
         }
         if(lar!=i){
             int temp=ht.get(lar);
             ht.set(lar,ht.get(i));
             ht.set(i,temp);
             heapify(ht,lar);
         }
    }
    void insert(ArrayList<Integer>ht,int n){
        int size=ht.size();
        if(size==0){
            ht.add(n);
        }
        else{
            ht.add(n);
            for(int i=size/2-1;i>=0;i--){
                heapify(ht,i);
            }
        }
    }
    void delete(ArrayList<Integer>ht,int num){
        int size=ht.size();
        int i;
        for( i=0;i<size;i++){
            if(num==ht.get(i)){
                break;
            }
        }
        if (i == size) {
            System.out.println("Element " + num + " not found in the heap.");
            return;
        }
            int temp=ht.get(i);
            ht.set(i,ht.get(size-1));
            ht.set(size-1,temp);
            ht.remove(size-1);
        
        for(int j=size/2-1;j>=0;j--){
            heapify(ht,j);
        }
    }
    void print(ArrayList<Integer>a,int size){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ArrayList<Integer>a=new ArrayList<Integer>();
        int size=a.size();
        Heap h=new Heap();
         h.insert(a,3);
        h.insert(a,4);
        h.insert(a,9);
        h.insert(a,5);
       h.insert(a,2);
        System.out.println("Max-before deletion:");
        h.print(a,size);
        h.delete(a,4);
       System.out.println("Max-after deletion:"); 
       h.print(a,size);
       
    }
}

