import java.util.*;

class duplicateelementsprintonetime {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7}; 
        int n = arr.length; 

        
        int[] temp = new int[n];
        int ind = 0; 

        
        for (int i = 0; i < n; i++) {
            boolean isUnique = true; 
            for (int j = 0; j < ind; j++) {
                if (temp[j] == arr[i]) {
                    isUnique = false; 
                    break; 
                }
            }
            if (isUnique) {
                temp[ind++] = arr[i];
            }
        }

        
        for (int j = 0; j < ind; j++) {
            System.out.println(temp[j]);
        }
    }
}
