import java.util.Arrays;
public class mergingtwoarrays{
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9};
        int[] c=new int[a.length+b.length];
        int ci=0;
        for(int i=0;i<a.length;i++){
            c[ci++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[ci++]=b[i];
        }
       // System.out.println(Arrays.toString(c));
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}