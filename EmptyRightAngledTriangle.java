import java.util.*;
public class EmptyRightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt(); // Number of rows for the triangle
        
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print '*' for the first and last columns, or for the last row
                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
//j==1 print left side * and j==i print diagonal * and i==n print bottom * 
                } else {
                    System.out.print("  "); // Print spaces for the empty inside
                }
            }
            System.out.println();
        }
    }
}
