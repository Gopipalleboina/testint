public class isosclesreversepyramid{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
           for(int s=1;s<=i;s++){
                System.out.print("  ");
            }
            for(int j=n+5-1;j>=i*2-1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}