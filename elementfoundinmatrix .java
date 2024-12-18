import java.util.Scanner;
class elementfoundinmatrix {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int m=3,n=3;
       int s=3;
       int found=0;
       int[][] matrix=new int[m][n];
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
               matrix[i][j]=sc.nextInt();
           }
       }
       for(int i=0;i< matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]==s){
                   System.out.println("element is found at"+" "+i+" "+j);
                   found=1;
                   break;
               }
           }
           if(found==0){
               System.out.println("not found");
           }
       }
    }
}