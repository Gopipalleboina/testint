public class insertmiddlearray {
    public static void main(String[] args) {
       
        int[] originalArray = {1, 2, 3, 4, 5};
        int newElement = 99;
        
        int middleIndex = originalArray.length / 2;
        
        int[] newArray = new int[originalArray.length + 1];
        
        for (int i = 0; i < middleIndex; i++) {
            newArray[i] = originalArray[i];
        }
        
        newArray[middleIndex] = newElement;
        
        for (int i = middleIndex; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }
        
        System.out.print("New array: ");
        int n = newArray.length;
        for (int i = 0; i < n; i++) {  
            System.out.print(newArray[i] + " ");
        }
    }
}
