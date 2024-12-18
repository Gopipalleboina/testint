public class hollowtrianglereversepyramid{
    public static void main(String[] args){
        int n=6;
       for(int i=n;i>=1;i--){
           for(int s=1;s<=n-i;s++){
               System.out.print(" ");
           }
           for(int j=1;j<=i*2-1;j++){
               if(j==1 || j==i*2-1 || i==n){
                   System.out.print("*");
               }
              else{
                   System.out.print(" ");
               }
             
           }
           System.out.println();
       }
    }
}