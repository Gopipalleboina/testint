import java.util.Scanner;

public class EmptyRightAngledTrianglemiddleempty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        for (int i = 1; i <= n; i++) {
          
            for (int s =n-i; s>=1; s--) {
                System.out.print(" ");
            }
            
            
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); 
            }
            
            System.out.println();  
        }
    }
}
