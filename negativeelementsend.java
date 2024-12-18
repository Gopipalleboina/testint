import java.util.Arrays;

public class negativeelementsend {
    public static void main(String[] args) {
        int[] arr = {1, -2, 2, -3, -9, 5};
        int n = arr.length;
        int[] temp=new int[n]; 
        int j= 0;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[j++] = arr[i]; 
            }
        }

        
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i]; 
            }
        }

        
         for ( int i = 0; i< temp.length; i++) {
            //arr[j] = temp[j]; 
      System.out.println(temp[i] + " ");
       }
       // System.out.println(Arrays.toString(temp));
    }
}


