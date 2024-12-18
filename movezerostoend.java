import java.util.Scanner;
class movezerostoend{
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,5};
        int n=arr.length;
        int[] temp=new int [n];
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[ind++]=arr[i];
            }
        }
        for(int i=ind;i<arr.length;i++){
            temp[i]=0;
        }
        
        for(int i=0;i<temp.length;i++){
          //  arr[i]=temp[i];
            System.out.print(temp[i]+" ");
        }
        
        
    }
}