public class hourglasspyramid{//ben 10 watch
    public static void main(String[] args){
        int n=5;
      for(int i=n;i>=1;i--){
     for(int s=1;s<=n-i;s++){
         System.out.print(" ");
     }
     for(int j=1;j<=i*2-1;j++){
         System.out.print("*");
     }
     System.out.println();
 }
 for(int i=2;i<=n;i++){
     for(int s=1;s<=n-i;s++){
         System.out.print(" ");
     }
     for(int j=1;j<=i*2-1;j++){
         System.out.print("*");
     }
     System.out.println();
 }
   }
}
    
