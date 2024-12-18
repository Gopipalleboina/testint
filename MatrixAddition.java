import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int r = scanner.nextInt();
         System.out.print("enter the number of columns:");
        int c = scanner.nextInt();
        
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int result[][] = new int[r][c];
        
        // Input values for matrix a
        System.out.println("Enter values for matrix A:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        
        // Input values for matrix b
        System.out.println("Enter values for matrix B:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                b[i][j] = scanner.nextInt();
            }
        }
        
        // Perform matrix addition
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        
        // Print the result matrix
        System.out.println("Resultant Matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }
        
       
    }
}
