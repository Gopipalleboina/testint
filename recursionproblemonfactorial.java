import java.util.*;
public class recursionproblemonfactorial{
static int fact(int n){
    if(n==0){
        return 1;
    }
    else{
        return n*fact(n-1);
    }
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int result=sc.nextInt();
    for(int i=1;i<=result;i++){
        System.out.println(fact(i)+" ");
    }
  /*  int num=fact(result);
   System.out.print(num+" ");*/


}
    
}

