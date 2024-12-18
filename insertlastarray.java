public class insertlastarray {
    public static void main(String[] args) {
       
        int[] originalArray = {1, 2, 3, 4, 5};
        int newElement = 99;
        
        int[] newArray = new int[originalArray.length + 1];
        
        
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        
        
        newArray[newArray.length - 1] = newElement;
        
        System.out.print("New array: ");
        int n = newArray.length;
        for (int i = 0; i < n; i++) {  
            System.out.print(newArray[i] + " ");
        }
    }
}