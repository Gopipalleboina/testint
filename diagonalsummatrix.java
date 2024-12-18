
import java.util.*;
public class diagonalsummatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
     
       int mat[][]=new int[r][c];
      
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              
           mat[i][j]=sc.nextInt();
         }
        }
         
        int pd=0;//primary diagonal
        int sd=0;//secondary diagonal
        for(int i=0;i<r;i++){
          
                 pd=pd+mat[i][i];
                 sd=sd+mat[i][r-i-1];
               
            
            } 
            System.out.println(pd);
            System.out.println(sd);
         
        
        
    }
}