import java.util.Arrays;

public class addingelementsbeginning {
    public static void main(String[] args) {
        int[] Array = {2, 3, 4, 5, 6}; 
        int newElement = 1; 
        int[] newArray = new int[Array.length + 1];

      
        newArray[0] = newElement;

       
        for (int i = 0; i < Array.length; i++) {
            newArray[i + 1] = Array[i];
        }

       for(int i=0;i<newArray.length;i++){
        System.out.print(newArray[i]+" ");
    }
    }
}
